@file:Suppress("MaxLineLength")

package tasks

import java.io.File
import java.time.Instant
import java.util.Locale
import kotlin.math.abs
import kotlin.math.max
import org.gradle.api.DefaultTask
import org.gradle.api.GradleException
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.Internal
import org.gradle.api.tasks.OutputDirectory
import org.gradle.api.tasks.TaskAction
import org.gradle.work.DisableCachingByDefault
import org.jetbrains.kotlin.com.google.gson.GsonBuilder
import org.jetbrains.kotlin.com.google.gson.JsonArray
import org.jetbrains.kotlin.com.google.gson.JsonElement
import org.jetbrains.kotlin.com.google.gson.JsonObject
import org.jetbrains.kotlin.com.google.gson.JsonParser

/** Creates a standalone HTML report from AndroidX Macrobenchmark JSON files. */
@DisableCachingByDefault(because = "The task consumes device output and records the current execution time")
abstract class PerformanceBenchmarkReportTask : DefaultTask() {

    @get:Internal
    abstract val benchmarkResultsDirectory: DirectoryProperty

    @get:Internal
    abstract val referenceDirectory: DirectoryProperty

    @get:Internal
    abstract val gitRootDirectory: DirectoryProperty

    @get:OutputDirectory
    abstract val outputDirectory: DirectoryProperty

    @get:Input
    abstract val recordReference: Property<Boolean>

    @get:Input
    abstract val failOnRegression: Property<Boolean>

    @TaskAction
    fun generate() {
        val resultsRoot = benchmarkResultsDirectory.get().asFile
        val jsonFiles = resultsRoot
            .takeIf(File::isDirectory)
            ?.walkTopDown()
            ?.filter { file -> file.isFile && file.name.endsWith("benchmarkData.json") }
            ?.toList()
            .orEmpty()
        if (jsonFiles.isEmpty()) {
            throw GradleException("AndroidX benchmark JSON was not found in ${resultsRoot.absolutePath}")
        }

        val generatedAt = Instant.now().toString()
        val git = GitMetadata(
            branch = gitValue("rev-parse", "--abbrev-ref", "HEAD"),
            commit = gitValue("rev-parse", "HEAD"),
            dirty = gitHasChanges(),
        )
        if (recordReference.get() && git.dirty) {
            logger.warn("Recording a performance reference from a dirty working tree. Commit the measured code first when the reference must be reproducible.")
        }
        var regressionsFound = false

        jsonFiles.forEach { sourceJson ->
            val current = parseRun(sourceJson)
            val deviceKey = sanitizePath(current.device.model.ifBlank { sourceJson.parentFile.name })
            val referenceJson = referenceDirectory.file("$deviceKey/reference.json").get().asFile

            if (recordReference.get() && !current.complete) {
                val coreCaseCount = current.cases.keys.count(CORE_CASES::containsKey)
                throw GradleException(
                    "Cannot record $deviceKey reference: expected ${CORE_CASES.size} core cases, " +
                        "found $coreCaseCount. Missing: ${current.missingCases.joinToString()}",
                )
            }

            val reference = if (!recordReference.get() && referenceJson.isFile) parseRun(referenceJson) else null
            val referenceMetadata = if (reference != null) readReferenceMetadata(referenceJson.parentFile) else null
            val compatibilityProblems = reference?.let { compatibilityProblems(current, it) }.orEmpty()
            val comparisons = compare(current, reference, compatibilityProblems.isEmpty())
            regressionsFound = regressionsFound || comparisons.any { it.status == CaseStatus.REGRESSION }

            val targetDirectory = outputDirectory.dir(deviceKey).get().asFile.apply { mkdirs() }
            val targetJson = File(targetDirectory, if (recordReference.get()) "reference.json" else "current.json")
            sourceJson.copyTo(targetJson, overwrite = true)

            val report = renderHtml(
                current = current,
                reference = reference,
                comparisons = comparisons,
                compatibilityProblems = compatibilityProblems,
                generatedAt = generatedAt,
                git = git,
                referenceMetadata = referenceMetadata,
                isRecordedReference = recordReference.get(),
            )
            File(targetDirectory, "index.html").writeText(report)
            File(targetDirectory, "metadata.json").writeText(
                GSON.toJson(
                    mapOf(
                        "generatedAtUtc" to generatedAt,
                        "git" to mapOf("branch" to git.branch, "commit" to git.commit, "dirty" to git.dirty),
                        "device" to current.device.model,
                        "sourceJson" to sourceJson.absolutePath,
                        "referenceJson" to referenceJson.takeIf(File::isFile)?.absolutePath,
                        "completeSuite" to current.complete,
                        "regressionCount" to comparisons.count { it.status == CaseStatus.REGRESSION },
                    ),
                ) + "\n",
            )
            logger.lifecycle(
                if (recordReference.get()) {
                    "Performance reference recorded: ${File(targetDirectory, "index.html").absolutePath}"
                } else {
                    "Performance report generated: ${File(targetDirectory, "index.html").absolutePath}"
                },
            )
        }

        if (regressionsFound && failOnRegression.get()) {
            throw GradleException("Performance regression candidates were found. Open the generated HTML report.")
        }
    }

    private fun parseRun(file: File): BenchmarkRun {
        val root = JsonParser.parseString(file.readText()).asJsonObject
        val context = root.objectOrEmpty("context")
        val build = context.objectOrEmpty("build")
        val device = DeviceContext(
            brand = build.string("brand"),
            device = build.string("device"),
            model = build.string("model"),
            fingerprint = build.string("fingerprint"),
            sdk = build.objectOrEmpty("version").string("sdk"),
            cpuCoreCount = context.string("cpuCoreCount"),
            cpuLocked = context.string("cpuLocked"),
            cpuMaxFreqHz = context["cpuMaxFreqHz"]?.toString().orEmpty(),
            compilationMode = context.string("compilationMode"),
        )
        val cases = linkedMapOf<String, BenchmarkCase>()
        root.arrayOrEmpty("benchmarks").forEach { element ->
            val benchmark = element.asJsonObject
            val rawName = benchmark.string("name")
            val canonicalName = SUPPORTED_CASES.keys.firstOrNull { rawName == it || rawName.endsWith("_$it") }
                ?: return@forEach
            if (cases.containsKey(canonicalName)) {
                throw GradleException("Duplicate benchmark case $canonicalName in ${file.absolutePath}")
            }
            val metrics = benchmark.objectOrEmpty("metrics")
            val sampledMetrics = benchmark.objectOrEmpty("sampledMetrics")
            val frameCount = summary(metrics.objectOrEmpty("frameCount"))
            val cpu = summary(sampledMetrics.objectOrEmpty("frameDurationCpuMs"))
            val overrunObject = sampledMetrics.objectOrEmpty("frameOverrunMs")
            val overrun = summary(overrunObject)
            val frameCountRuns = metrics.objectOrEmpty("frameCount").arrayOrEmpty("runs").numbers()
            val overrunRuns = overrunObject.arrayOrEmpty("runs")
                .map { run -> run.takeIf(JsonElement::isJsonArray)?.asJsonArray?.numbers().orEmpty() }
            val frameValues = overrunRuns.flatten()
            val jankCount = frameValues.count { it > 0.0 }
            val iterations = overrunRuns.mapIndexed { index, values ->
                val iterationJankCount = values.count { it > 0.0 }
                IterationSummary(
                    index = index + 1,
                    frameCount = frameCountRuns.getOrNull(index)?.toInt() ?: values.size,
                    overrunP95 = percentile(values, 0.95),
                    overrunP99 = percentile(values, 0.99),
                    jankRate = values.takeIf { it.isNotEmpty() }
                        ?.let { iterationJankCount * 100.0 / it.size },
                )
            }
            cases[canonicalName] = BenchmarkCase(
                name = canonicalName,
                displayName = SUPPORTED_CASES.getValue(canonicalName),
                repeatIterations = benchmark.number("repeatIterations"),
                warmupIterations = benchmark.number("warmupIterations"),
                thermalThrottleSleepSeconds = benchmark.number("thermalThrottleSleepSeconds"),
                totalRunTimeNs = benchmark.number("totalRunTimeNs"),
                frameCount = frameCount,
                cpu = cpu,
                overrun = overrun,
                totalFrames = frameValues.size,
                jankFrames = jankCount,
                jankRate = frameValues.takeIf { it.isNotEmpty() }?.let { jankCount * 100.0 / it.size },
                iterations = iterations,
            )
        }
        if (cases.isEmpty()) throw GradleException("No supported benchmark cases in ${file.absolutePath}")
        return BenchmarkRun(
            source = file,
            device = device,
            cases = cases,
            missingCases = CORE_CASES.keys - cases.keys,
        )
    }

    private fun summary(metric: JsonObject) = MetricSummary(
        minimum = metric.number("minimum"),
        median = metric.number("median"),
        maximum = metric.number("maximum"),
        coefficientOfVariation = metric.number("coefficientOfVariation"),
        p50 = metric.number("P50"),
        p90 = metric.number("P90"),
        p95 = metric.number("P95"),
        p99 = metric.number("P99"),
    )

    private fun percentile(values: List<Double>, percentile: Double): Double? {
        if (values.isEmpty()) return null
        val sorted = values.sorted()
        val position = (sorted.lastIndex * percentile).coerceIn(0.0, sorted.lastIndex.toDouble())
        val lowerIndex = position.toInt()
        val upperIndex = (lowerIndex + 1).coerceAtMost(sorted.lastIndex)
        val fraction = position - lowerIndex
        return sorted[lowerIndex] + (sorted[upperIndex] - sorted[lowerIndex]) * fraction
    }

    private fun compatibilityProblems(current: BenchmarkRun, reference: BenchmarkRun): List<String> = buildList {
        val commonCases = current.cases.keys.intersect(reference.cases.keys)
        if (commonCases.isEmpty()) return@buildList
        if (current.device.brand != reference.device.brand || current.device.model != reference.device.model) {
            add("другая модель устройства")
        }
        if (current.device.device != reference.device.device) add("другой идентификатор Android-устройства")
        if (current.device.fingerprint != reference.device.fingerprint) add("другой build fingerprint")
        if (current.device.compilationMode != reference.device.compilationMode) add("другой режим компиляции")
        if (current.device.cpuLocked != reference.device.cpuLocked) add("другое значение cpuLocked")
        if (current.device.cpuMaxFreqHz != reference.device.cpuMaxFreqHz) add("другие максимальные частоты CPU")
        if (commonCases.any { current.cases[it]?.repeatIterations != reference.cases[it]?.repeatIterations }) {
            add("разное число измеренных итераций")
        }
    }

    private fun compare(
        current: BenchmarkRun,
        reference: BenchmarkRun?,
        compatible: Boolean,
    ): List<CaseComparison> = SUPPORTED_CASES.keys.mapNotNull { name ->
        val currentCase = current.cases[name] ?: return@mapNotNull null
        val referenceCase = reference?.cases?.get(name)
        val status = when {
            reference == null -> CaseStatus.NO_REFERENCE
            referenceCase == null -> CaseStatus.NO_REFERENCE
            !compatible -> CaseStatus.INCOMPATIBLE
            isRegression(currentCase, referenceCase) -> CaseStatus.REGRESSION
            isImprovement(currentCase, referenceCase) -> CaseStatus.IMPROVEMENT
            else -> CaseStatus.STABLE
        }
        CaseComparison(currentCase, referenceCase, status)
    }

    private fun isRegression(current: BenchmarkCase, reference: BenchmarkCase): Boolean {
        val overrunRegression = exceedsThreshold(current.overrun.p95, reference.overrun.p95, 3.0, 0.15)
        val cpuRegression = exceedsThreshold(current.cpu.p95, reference.cpu.p95, 2.0, 0.15)
        val jankRegression = current.jankRate != null && reference.jankRate != null &&
            current.jankRate - reference.jankRate > 5.0
        return overrunRegression || cpuRegression || jankRegression
    }

    private fun isImprovement(current: BenchmarkCase, reference: BenchmarkCase): Boolean {
        val overrunImprovement = exceedsThreshold(reference.overrun.p95, current.overrun.p95, 3.0, 0.15)
        val cpuImprovement = exceedsThreshold(reference.cpu.p95, current.cpu.p95, 2.0, 0.15)
        val jankImprovement = current.jankRate != null && reference.jankRate != null &&
            reference.jankRate - current.jankRate > 5.0
        return overrunImprovement || cpuImprovement || jankImprovement
    }

    private fun exceedsThreshold(current: Double?, reference: Double?, minimumDelta: Double, ratio: Double): Boolean {
        if (current == null || reference == null) return false
        return current - reference > max(minimumDelta, abs(reference) * ratio)
    }

    private fun renderHtml(
        current: BenchmarkRun,
        reference: BenchmarkRun?,
        comparisons: List<CaseComparison>,
        compatibilityProblems: List<String>,
        generatedAt: String,
        git: GitMetadata,
        referenceMetadata: ReferenceMetadata?,
        isRecordedReference: Boolean,
    ): String {
        val regressionCount = comparisons.count { it.status == CaseStatus.REGRESSION }
        val comparableCaseCount = comparisons.count { it.reference != null }
        val overallStatus = when {
            isRecordedReference -> "РЕФЕРЕНС СОХРАНЁН"
            reference == null -> "НЕТ РЕФЕРЕНСА"
            compatibilityProblems.isNotEmpty() -> "НЕСОВМЕСТИМО"
            comparableCaseCount == 0 -> "НЕТ СРАВНИМЫХ СЦЕНАРИЕВ"
            regressionCount > 0 -> "КАНДИДАТОВ НА РЕГРЕССИЮ: $regressionCount"
            else -> "СТАБИЛЬНО"
        }
        val overallClass = when {
            isRecordedReference -> "info"
            reference == null || compatibilityProblems.isNotEmpty() || comparableCaseCount == 0 -> "warning"
            regressionCount > 0 -> "bad"
            else -> "good"
        }
        val comparisonEnabled = reference != null && compatibilityProblems.isEmpty()
        val visualComparisons = comparisons.sortedByDescending { it.current.overrun.p95 ?: Double.NEGATIVE_INFINITY }
        val barScaleMaximum = visualComparisons
            .flatMap { comparison ->
                listOfNotNull(
                    comparison.current.overrun.p95,
                    comparison.reference?.overrun?.p95?.takeIf { comparisonEnabled },
                )
            }
            .filter { it > 0.0 }
            .maxOrNull()
            ?.times(1.08)
            ?: 1.0
        val overviewRows = renderOverviewRows(visualComparisons, barScaleMaximum, comparisonEnabled)
        val iterationHeatmap = renderIterationHeatmap(visualComparisons.map { it.current })
        val worstCase = visualComparisons.firstOrNull()?.current
        val iterationCounts = current.cases.values.mapNotNull { it.repeatIterations?.toInt() }.distinct()
        val iterationCountText = when (iterationCounts.size) {
            0 -> "—"
            1 -> iterationCounts.single().toString()
            else -> iterationCounts.sorted().joinToString("–")
        }
        val referenceSummary = when {
            isRecordedReference -> "Сохранён из текущего прогона"
            referenceMetadata != null -> "${html(referenceMetadata.branch)} @ ${html(referenceMetadata.commit.take(7))}"
            reference != null -> "Референс найден"
            else -> "Референс не записан"
        }
        val comparisonRows = comparisons.joinToString("") { comparison ->
            val currentCase = comparison.current
            val referenceCase = comparison.reference
            """
            <tr>
              <th>${html(currentCase.displayName)}</th>
              <td class="${comparison.status.css}">${comparison.status.label}</td>
              ${comparisonCells(currentCase.overrun.p95, referenceCase?.overrun?.p95, "ms")}
              ${comparisonCells(currentCase.cpu.p95, referenceCase?.cpu?.p95, "ms")}
              ${comparisonCells(currentCase.jankRate, referenceCase?.jankRate, "%", percentagePoints = true)}
            </tr>
            """.trimIndent()
        }
        val metricRows = current.cases.values.joinToString("") { item ->
            """
            <tr>
              <th>${html(item.displayName)}</th>
              <td>${number(item.repeatIterations, 0)}</td>
              <td>${number(item.frameCount.minimum, 0)}</td><td>${number(item.frameCount.median, 0)}</td><td>${number(item.frameCount.maximum, 0)}</td>
              <td>${number(item.frameCount.coefficientOfVariation, 3)}</td>
              <td>${number(item.cpu.p50)}</td><td>${number(item.cpu.p90)}</td><td class="focus-metric">${number(item.cpu.p95)}</td><td>${number(item.cpu.p99)}</td>
              <td>${signed(item.overrun.p50)}</td><td>${signed(item.overrun.p90)}</td><td class="focus-metric">${signed(item.overrun.p95)}</td><td>${signed(item.overrun.p99)}</td>
              <td>${number(item.jankRate)}%</td>
            </tr>
            """.trimIndent()
        }
        val coreCaseCount = current.cases.keys.count(CORE_CASES::containsKey)
        val suiteWarning = if (current.complete) {
            "<p class=\"good-text\">Полный набор: $coreCaseCount/${CORE_CASES.size}.</p>"
        } else {
            "<p class=\"warning-text\">Частичный набор: $coreCaseCount/${CORE_CASES.size}. " +
                "Отсутствуют: ${html(current.missingCases.joinToString())}.</p>"
        }
        val compatibilityWarning = compatibilityProblems.takeIf { it.isNotEmpty() }?.let {
            "<p class=\"warning-text\"><strong>Сравнение отключено:</strong> ${html(it.joinToString())}.</p>"
        }.orEmpty()
        val referenceText = reference?.source?.absolutePath ?: "не найден"
        return """
        <!doctype html>
        <html lang="ru">
        <head>
          <meta charset="utf-8">
          <meta name="viewport" content="width=device-width,initial-scale=1">
          <title>Отчёт по производительности — ${html(current.device.model)}</title>
          <style>
            :root{font-family:Inter,system-ui,-apple-system,BlinkMacSystemFont,"Segoe UI",sans-serif;color-scheme:light;--page:#f5f7fa;--surface:#fff;--text:#161a22;--muted:#687181;--border:#dde2ea;--good:#16834a;--good-soft:#e9f7ef;--bad:#cf3038;--bad-soft:#fff0f1;--warn:#b76a00;--warn-soft:#fff5df;--info:#316bcc;--info-soft:#edf3ff;--stable:#526173;--stable-soft:#eef1f5}
            *{box-sizing:border-box}body{max-width:1600px;margin:auto;padding:32px;background:var(--page);color:var(--text);line-height:1.45}h1,h2,h3,p{margin-top:0}.scroll,.heatmap-scroll{overflow-x:auto}
            .page-header{display:flex;align-items:center;gap:16px;flex-wrap:wrap;margin-bottom:14px}.page-header h1{margin:0}.status{display:inline-block;padding:8px 13px;border-radius:9px;color:#fff;font-size:13px;font-weight:800;letter-spacing:.02em}.good{background:var(--good)}.bad{background:var(--bad)}.warning{background:var(--warn)}.info{background:var(--info)}
            .good-text,.warning-text{background:var(--surface);border-radius:8px;padding:10px 14px}.good-text{border-left:4px solid var(--good)}.warning-text{border-left:4px solid var(--warn)}
            .run-meta{color:var(--muted);font-size:13px;margin:10px 0 20px}.summary-grid{display:grid;grid-template-columns:repeat(4,minmax(0,1fr));gap:14px;margin:20px 0}.summary-card,.panel,.dashboard-panel{background:var(--surface);border:1px solid var(--border);border-radius:14px;box-shadow:0 2px 8px #1b263814}
            .summary-card{padding:18px}.summary-label{color:var(--muted);font-size:13px;margin-bottom:6px}.summary-value{font-size:24px;font-weight:780;line-height:1.15}.summary-note{color:var(--muted);font-size:12px;margin-top:7px;overflow-wrap:anywhere}
            .dashboard-grid{display:grid;grid-template-columns:minmax(0,2fr) minmax(360px,1fr);gap:16px;align-items:start}.dashboard-panel{padding:20px}.panel-title{display:flex;justify-content:space-between;align-items:flex-start;gap:12px;margin-bottom:6px}.panel-title h2{font-size:20px;margin:0}.panel-help{color:var(--muted);font-size:12px;margin-bottom:16px}
            .legend{display:flex;gap:18px;flex-wrap:wrap;color:var(--muted);font-size:12px;margin:10px 0 16px}.legend-item{display:flex;align-items:center;gap:7px}.legend-current{width:30px;height:5px;border-radius:5px;background:#e98b0c}.legend-reference{width:0;height:18px;border-left:3px dashed #6f7783}.legend-zero{width:2px;height:18px;background:#303641}
            .benchmark-list{display:grid;gap:9px}.benchmark-row{display:grid;grid-template-columns:30px minmax(0,1fr) 126px;gap:12px;align-items:center;padding:12px;border:1px solid var(--border);border-radius:11px}.rank{width:28px;height:28px;display:grid;place-items:center;background:#f0f3f7;border-radius:7px;font-weight:750}.case-heading{display:flex;justify-content:space-between;gap:10px;align-items:center;margin-bottom:9px}.case-name{font-weight:720}.case-status{font-size:11px;font-weight:800;padding:4px 7px;border-radius:6px;white-space:nowrap}.status-cell-stable{color:var(--stable);background:var(--stable-soft)}.status-cell-good{color:var(--good);background:var(--good-soft)}.status-cell-bad{color:var(--bad);background:var(--bad-soft)}.status-cell-warning{color:var(--warn);background:var(--warn-soft)}
            .bar-track{height:14px;position:relative;background:#eef1f5;border-radius:0 8px 8px 0;margin-left:2px}.zero-marker{position:absolute;left:0;top:-5px;bottom:-5px;width:2px;background:#303641;z-index:3}.current-bar{height:100%;border-radius:0 7px 7px 0;min-width:2px}.severity-good{background:var(--good)}.severity-low{background:#efad1f}.severity-medium{background:#ea7e0c}.severity-high{background:var(--bad)}.reference-marker{position:absolute;top:-6px;bottom:-6px;width:0;border-left:3px dashed #626b78;z-index:4}.bar-labels{display:flex;gap:12px;flex-wrap:wrap;color:var(--muted);font-size:12px;margin-top:7px}.bar-labels strong{color:var(--text)}.delta-box{text-align:right;font-size:12px;color:var(--muted)}.delta-box strong{display:block;color:var(--text);font-size:14px}.secondary-metrics{display:flex;justify-content:flex-end;gap:10px;margin-top:6px;font-size:11px;color:var(--muted)}
            .heatmap-grid{display:grid;min-width:520px;border:1px solid var(--border);border-radius:10px;overflow:hidden}.heat-cell{padding:10px;border-right:1px solid var(--surface);border-bottom:1px solid var(--surface);text-align:center;font-size:12px}.heat-label{text-align:left;background:#f6f8fb;font-weight:650}.heat-header{background:#eef1f5;font-weight:750}.heatmap-note{color:var(--muted);font-size:12px;margin:12px 0 0}.heat-legend{display:flex;gap:10px;flex-wrap:wrap;margin:0 0 14px;color:var(--muted);font-size:11px}.heat-legend span{display:flex;align-items:center;gap:5px}.heat-swatch{width:12px;height:12px;border-radius:3px}
            details.panel{margin-top:16px;padding:0}details.panel>summary{cursor:pointer;list-style:none;padding:17px 20px;font-weight:750}details.panel>summary::-webkit-details-marker{display:none}details.panel>summary:before{content:"›";display:inline-block;margin-right:10px;transition:transform .15s}details[open].panel>summary:before{transform:rotate(90deg)}.details-content{padding:0 20px 20px;border-top:1px solid var(--border)}
            .glossary-grid{display:grid;grid-template-columns:repeat(3,minmax(0,1fr));gap:12px;margin-top:18px}.glossary-item{padding:14px;background:#f7f9fc;border-radius:10px}.glossary-item strong{display:block;margin-bottom:5px}.glossary-item span{font-size:13px;color:var(--muted)}
            table{border-collapse:separate;border-spacing:0;width:100%;margin:16px 0 4px;font-size:13px}th,td{border-right:1px solid var(--border);border-bottom:1px solid var(--border);padding:9px 10px;text-align:right;white-space:nowrap}tr>*:first-child{border-left:1px solid var(--border);text-align:left;position:sticky;left:0;background:var(--surface);z-index:1}thead th{background:#eef1f5!important;border-top:1px solid var(--border);font-weight:750}.focus-metric{background:#fff6df}.table-note{color:var(--muted);font-size:12px}code{overflow-wrap:anywhere;white-space:normal}
            @media(max-width:1050px){body{padding:18px}.summary-grid{grid-template-columns:repeat(2,minmax(0,1fr))}.dashboard-grid{grid-template-columns:1fr}.glossary-grid{grid-template-columns:1fr 1fr}}
            @media(max-width:650px){.summary-grid{grid-template-columns:1fr}.benchmark-row{grid-template-columns:28px minmax(0,1fr)}.delta-box{grid-column:2;text-align:left}.glossary-grid{grid-template-columns:1fr}}
          </style>
        </head>
        <body>
          <header class="page-header"><h1>Отчёт по производительности</h1><span class="status $overallClass">$overallStatus</span></header>
          $suiteWarning
          $compatibilityWarning
          <p class="run-meta">Сформирован ${html(generatedAt)} · ветка <code>${html(git.branch)}</code> · коммит <code>${html(git.commit)}</code> · есть незакоммиченные изменения: <strong>${git.dirty}</strong></p>
          <section class="summary-grid">
            <article class="summary-card"><div class="summary-label">Набор тестов</div><div class="summary-value">$coreCaseCount / ${CORE_CASES.size}</div><div class="summary-note">стабильных сценариев</div></article>
            <article class="summary-card"><div class="summary-label">Устройство</div><div class="summary-value">${html(current.device.model)}</div><div class="summary-note">$referenceSummary</div></article>
            <article class="summary-card"><div class="summary-label">Худший Overrun P95</div><div class="summary-value">${signed(worstCase?.overrun?.p95)} мс</div><div class="summary-note">${html(worstCase?.displayName ?: "—")}</div></article>
            <article class="summary-card"><div class="summary-label">Измеренных итераций</div><div class="summary-value">$iterationCountText</div><div class="summary-note">на каждый сценарий</div></article>
          </section>
          <section class="dashboard-grid">
            <article class="dashboard-panel">
              <div class="panel-title"><h2>Обзор соблюдения frame deadline</h2></div>
              <p class="panel-help">Сценарии отсортированы по текущему frameOverrunMs P95. Длина и цвет полосы показывают нагрузку относительно deadline внутри этого прогона; статус определяется только сравнением с совместимым референсом.</p>
              <div class="legend"><span class="legend-item"><i class="legend-zero"></i>0 = frame deadline</span><span class="legend-item"><i class="legend-current"></i>Текущий прогон</span><span class="legend-item"><i class="legend-reference"></i>Референс</span></div>
              <div class="benchmark-list">$overviewRows</div>
            </article>
            <article class="dashboard-panel">
              <div class="panel-title"><h2>Стабильность итераций — текущий прогон</h2></div>
              <p class="panel-help">Каждая ячейка — frameOverrunMs P95, рассчитанный по исходным кадрам одной измеренной итерации.</p>
              <div class="heat-legend"><span><i class="heat-swatch" style="background:#dff3e7"></i>≤ 2 мс</span><span><i class="heat-swatch" style="background:#fff0b8"></i>2–8 мс</span><span><i class="heat-swatch" style="background:#ffd19b"></i>8–16 мс</span><span><i class="heat-swatch" style="background:#f3a6ab"></i>&gt; 16 мс</span></div>
              $iterationHeatmap
            </article>
          </section>
          <details class="panel">
            <summary>Как читать метрики и percentile</summary>
            <div class="details-content">
              <div class="glossary-grid">
                <div class="glossary-item"><strong>frameOverrunMs</strong><span>Время относительно frame deadline устройства. Положительное значение означает, что кадр не уложился в deadline; отрицательное показывает оставшийся запас.</span></div>
                <div class="glossary-item"><strong>frameDurationCpuMs</strong><span>CPU-время формирования кадра на UI thread и RenderThread. Помогает отличить вычислительную нагрузку от других задержек рендеринга.</span></div>
                <div class="glossary-item"><strong>P50</strong><span>Медиана: 50% измеренных кадров имеют это или меньшее значение. Описывает типичный кадр.</span></div>
                <div class="glossary-item"><strong>P90</strong><span>90% кадров имеют это или меньшее значение. Показывает начало медленного хвоста распределения.</span></div>
                <div class="glossary-item"><strong>P95 — основной сигнал</strong><span>95% кадров имеют это или меньшее значение, а худшие 5% — большее. Лучше P99 сочетает чувствительность к заметным просадкам и повторяемость результата.</span></div>
                <div class="glossary-item"><strong>P99</strong><span>Край распределения. Полезен для поиска редких зависаний и выбора Perfetto trace, но сильнее реагирует на единичный выброс и шум устройства.</span></div>
                <div class="glossary-item"><strong>Jank rate</strong><span>Доля исходных кадров, у которых frameOverrunMs &gt; 0. Используется как дополнительный сигнал: небольшие колебания около нуля могут заметно менять процент.</span></div>
                <div class="glossary-item"><strong>frameCount / CV</strong><span>Число кадров в итерации и коэффициент его вариации. Высокий CV может означать, что сам сценарий воспроизводится нестабильно.</span></div>
                <div class="glossary-item"><strong>Почему недостаточно одного P95?</strong><span>Overrun P95 ранжирует заметные пропуски deadline; CPU P95, P99, jank rate и стабильность итераций дают контекст и помогают решить, нужен ли анализ Perfetto.</span></div>
              </div>
              <p class="table-note">Регрессия: Overrun P95 вырос больше чем на max(3 мс, 15%), CPU P95 — больше чем на max(2 мс, 15%) или jank rate — больше чем на 5 процентных пунктов. Для улучшения используются те же пороги в обратную сторону. Небольшие изменения считаются стабильными.</p>
            </div>
          </details>
          <details class="panel">
            <summary>Подробная таблица percentile</summary>
            <div class="details-content">
              <p class="table-note">Точные значения текущего прогона. Подсвеченные колонки P95 используются для основного сравнения; P50/P90/P99 описывают остальные части распределения.</p>
              <div class="scroll"><table>
                <thead><tr><th rowspan="2">Сценарий</th><th rowspan="2">Итерации</th><th colspan="4">frameCount</th><th colspan="4">frameDurationCpuMs</th><th colspan="4">frameOverrunMs</th><th rowspan="2">Jank rate</th></tr>
                <tr><th>min</th><th>median</th><th>max</th><th>CV</th><th>P50</th><th>P90</th><th class="focus-metric">P95</th><th>P99</th><th>P50</th><th>P90</th><th class="focus-metric">P95</th><th>P99</th></tr></thead>
                <tbody>$metricRows</tbody>
              </table></div>
            </div>
          </details>
          <details class="panel">
            <summary>Точное сравнение с референсом</summary>
            <div class="details-content">
              <p class="table-note">Референс, текущее значение и разница для каждой метрики, участвующей в автоматическом определении статуса.</p>
              <div class="scroll"><table>
                <thead><tr><th rowspan="2">Сценарий</th><th rowspan="2">Статус</th><th colspan="3">Overrun P95</th><th colspan="3">CPU P95</th><th colspan="3">Jank rate</th></tr>
                <tr><th>Референс</th><th>Текущий</th><th>Разница</th><th>Референс</th><th>Текущий</th><th>Разница</th><th>Референс</th><th>Текущий</th><th>Разница</th></tr></thead>
                <tbody>$comparisonRows</tbody>
              </table></div>
            </div>
          </details>
          <details class="panel">
            <summary>Окружение и исходные файлы</summary>
            <div class="details-content"><table>
              <tr><th>Устройство</th><td>${html("${current.device.brand} ${current.device.model}".trim())}</td></tr>
              <tr><th>Android SDK</th><td>${html(current.device.sdk)}</td></tr>
              <tr><th>Fingerprint</th><td>${html(current.device.fingerprint)}</td></tr>
              <tr><th>Ядра CPU / locked</th><td>${html(current.device.cpuCoreCount)} / ${html(current.device.cpuLocked)}</td></tr>
              <tr><th>Режим компиляции</th><td>${html(current.device.compilationMode)}</td></tr>
              <tr><th>Текущий JSON</th><td><code>${html(current.source.absolutePath)}</code></td></tr>
              <tr><th>JSON референса</th><td><code>${html(referenceText)}</code></td></tr>
              <tr><th>Ревизия референса</th><td>${referenceRevision(referenceMetadata)}</td></tr>
            </table></div>
          </details>
          <p class="run-meta">Perfetto traces намеренно не копируются в отчёт. Для поиска причины проблемы используются traces из build-директории Android.</p>
        </body>
        </html>
        """.trimIndent()
    }

    private fun renderOverviewRows(
        comparisons: List<CaseComparison>,
        scaleMaximum: Double,
        comparisonEnabled: Boolean,
    ): String = comparisons.mapIndexed { index, comparison ->
        val current = comparison.current
        val reference = comparison.reference.takeIf { comparisonEnabled }
        val currentOverrun = current.overrun.p95
        val referenceOverrun = reference?.overrun?.p95
        val currentWidth = barWidth(currentOverrun, scaleMaximum)
        val referenceMarker = referenceOverrun?.let {
            "<i class=\"reference-marker\" style=\"left:${barWidth(it, scaleMaximum)}%\" title=\"Референс ${signed(it)} мс\"></i>"
        }.orEmpty()
        val referenceLabel = referenceOverrun?.let { "<span>Референс <strong>${signed(it)} мс</strong></span>" }
            ?: "<span>Референс <strong>—</strong></span>"
        val delta = metricDelta(currentOverrun, referenceOverrun)
        """
        <article class="benchmark-row">
          <div class="rank">${index + 1}</div>
          <div>
            <div class="case-heading"><span class="case-name">${html(current.displayName)}</span><span class="case-status ${comparison.status.css}">${comparison.status.label}</span></div>
            <div class="bar-track"><i class="zero-marker"></i><div class="current-bar ${severityClass(currentOverrun, scaleMaximum)}" style="width:$currentWidth%"></div>$referenceMarker</div>
            <div class="bar-labels"><span>Текущий <strong>${signed(currentOverrun)} мс</strong></span>$referenceLabel</div>
            <div class="secondary-metrics"><span>CPU P95 ${number(current.cpu.p95)} мс</span><span>Jank ${number(current.jankRate)}%</span></div>
          </div>
          <div class="delta-box ${comparison.status.css}"><strong>${delta.first}</strong><span>${delta.second}</span></div>
        </article>
        """.trimIndent()
    }.joinToString("")

    private fun renderIterationHeatmap(cases: List<BenchmarkCase>): String {
        val columnCount = cases.maxOfOrNull { it.iterations.size } ?: 0
        if (columnCount == 0) return "<p class=\"warning-text\">Исходные покадровые данные по итерациям недоступны.</p>"
        val columns = "minmax(180px,1.5fr) repeat($columnCount,minmax(82px,1fr))"
        val header = (1..columnCount).joinToString("") { "<div class=\"heat-cell heat-header\">Итерация $it</div>" }
        val rows = cases.joinToString("") { benchmarkCase ->
            val cells = (0 until columnCount).joinToString("") { index ->
                val iteration = benchmarkCase.iterations.getOrNull(index)
                if (iteration == null) {
                    "<div class=\"heat-cell\">—</div>"
                } else {
                    val title = "Кадров ${iteration.frameCount}; P99 ${signed(iteration.overrunP99)} мс; jank ${number(iteration.jankRate)}%"
                    "<div class=\"heat-cell\" style=\"${heatStyle(iteration.overrunP95)}\" title=\"${html(title)}\">${signed(iteration.overrunP95)} мс</div>"
                }
            }
            "<div class=\"heat-cell heat-label\">${html(benchmarkCase.displayName)}</div>$cells"
        }
        return """
            <div class="heatmap-scroll"><div class="heatmap-grid" style="grid-template-columns:$columns">
              <div class="heat-cell heat-header">Сценарий</div>$header$rows
            </div></div>
            <p class="heatmap-note">Цвет показывает абсолютную величину опоздания P95, а не регрессию относительно референса. Зелёный допускает до 2 мс как небольшое превышение или шум. При наведении показываются P99, jank rate и число кадров.</p>
        """.trimIndent()
    }

    private fun barWidth(value: Double?, scaleMaximum: Double): String {
        val width = ((value ?: 0.0).coerceAtLeast(0.0) / scaleMaximum * 100.0).coerceIn(0.4, 100.0)
        return number(width, 2)
    }

    private fun severityClass(value: Double?, scaleMaximum: Double): String {
        if (value == null || value <= 0.0) return "severity-good"
        val ratio = value / scaleMaximum
        return when {
            ratio >= 0.62 -> "severity-high"
            ratio >= 0.30 -> "severity-medium"
            else -> "severity-low"
        }
    }

    private fun heatStyle(value: Double?): String = when {
        value == null -> "background:#f0f2f5"
        value <= 2.0 -> "background:#dff3e7"
        value <= 8.0 -> "background:#fff0b8"
        value <= 16.0 -> "background:#ffd19b"
        else -> "background:#f3a6ab"
    }

    private fun metricDelta(current: Double?, reference: Double?): Pair<String, String> {
        if (current == null || reference == null) return "—" to "нет совместимого референса"
        val delta = current - reference
        val percentage = if (abs(reference) < 0.01) null else delta / abs(reference) * 100.0
        return "${signed(delta)} мс" to (percentage?.let { "${signed(it)}%" } ?: "процент недоступен")
    }

    private fun comparisonCells(
        current: Double?,
        reference: Double?,
        unit: String,
        percentagePoints: Boolean = false,
    ): String {
        val delta = if (current != null && reference != null) current - reference else null
        val deltaText = when {
            delta == null -> "—"
            percentagePoints -> "${signed(delta)} pp"
            else -> "${signed(delta)} $unit"
        }
        return "<td>${number(reference)} $unit</td><td>${number(current)} $unit</td><td>$deltaText</td>"
    }

    private fun gitValue(vararg arguments: String): String? = runCatching {
        val process = ProcessBuilder(listOf("git") + arguments)
            .directory(gitRootDirectory.get().asFile)
            .redirectErrorStream(true)
            .start()
        process.inputStream.bufferedReader().use { it.readText().trim() }
            .takeIf { process.waitFor() == 0 && it.isNotBlank() }
    }.getOrNull()

    private fun gitHasChanges(): Boolean = runCatching {
        val process = ProcessBuilder("git", "status", "--porcelain")
            .directory(gitRootDirectory.get().asFile)
            .redirectErrorStream(true)
            .start()
        val output = process.inputStream.bufferedReader().use { it.readText() }
        process.waitFor() == 0 && output.isNotBlank()
    }.getOrDefault(false)

    private fun readReferenceMetadata(directory: File): ReferenceMetadata? = runCatching {
        val root = JsonParser.parseString(File(directory, "metadata.json").readText()).asJsonObject
        val git = root.objectOrEmpty("git")
        ReferenceMetadata(
            generatedAt = root.string("generatedAtUtc"),
            branch = git.string("branch"),
            commit = git.string("commit"),
            dirty = git["dirty"]?.takeUnless(JsonElement::isJsonNull)?.asBoolean,
        )
    }.getOrNull()

    private fun referenceRevision(metadata: ReferenceMetadata?): String = metadata?.let {
        "${html(it.branch)} / <code>${html(it.commit)}</code> / ${html(it.generatedAt)} / незакоммиченные изменения=${it.dirty}"
    } ?: "—"

    private fun sanitizePath(value: String): String = value.replace(Regex("[^a-zA-Z0-9._-]"), "-")

    private fun html(value: Any?): String = value?.toString().orEmpty()
        .replace("&", "&amp;")
        .replace("<", "&lt;")
        .replace(">", "&gt;")
        .replace("\"", "&quot;")
        .replace("'", "&#039;")

    private fun number(value: Double?, decimals: Int = 2): String = value?.let {
        String.format(Locale.US, "%.${decimals}f", it)
    } ?: "—"

    private fun signed(value: Double?): String = value?.let { String.format(Locale.US, "%+.2f", it) } ?: "—"

    private fun JsonObject.objectOrEmpty(name: String): JsonObject = get(name)?.takeIf(JsonElement::isJsonObject)?.asJsonObject ?: JsonObject()

    private fun JsonObject.arrayOrEmpty(name: String): JsonArray = get(name)?.takeIf(JsonElement::isJsonArray)?.asJsonArray ?: JsonArray()

    private fun JsonObject.string(name: String): String = get(name)?.takeUnless(JsonElement::isJsonNull)?.asString.orEmpty()

    private fun JsonObject.number(name: String): Double? = get(name)?.takeUnless(JsonElement::isJsonNull)?.runCatching { asDouble }?.getOrNull()

    private fun JsonArray.numbers(): List<Double> = mapNotNull { element -> element.takeUnless(JsonElement::isJsonNull)?.runCatching { asDouble }?.getOrNull() }

    private data class GitMetadata(val branch: String?, val commit: String?, val dirty: Boolean)

    private data class ReferenceMetadata(
        val generatedAt: String,
        val branch: String,
        val commit: String,
        val dirty: Boolean?,
    )

    private data class DeviceContext(
        val brand: String,
        val device: String,
        val model: String,
        val fingerprint: String,
        val sdk: String,
        val cpuCoreCount: String,
        val cpuLocked: String,
        val cpuMaxFreqHz: String,
        val compilationMode: String,
    )

    private data class MetricSummary(
        val minimum: Double?,
        val median: Double?,
        val maximum: Double?,
        val coefficientOfVariation: Double?,
        val p50: Double?,
        val p90: Double?,
        val p95: Double?,
        val p99: Double?,
    )

    private data class BenchmarkCase(
        val name: String,
        val displayName: String,
        val repeatIterations: Double?,
        val warmupIterations: Double?,
        val thermalThrottleSleepSeconds: Double?,
        val totalRunTimeNs: Double?,
        val frameCount: MetricSummary,
        val cpu: MetricSummary,
        val overrun: MetricSummary,
        val totalFrames: Int,
        val jankFrames: Int,
        val jankRate: Double?,
        val iterations: List<IterationSummary>,
    )

    private data class IterationSummary(
        val index: Int,
        val frameCount: Int,
        val overrunP95: Double?,
        val overrunP99: Double?,
        val jankRate: Double?,
    )

    private data class BenchmarkRun(
        val source: File,
        val device: DeviceContext,
        val cases: Map<String, BenchmarkCase>,
        val missingCases: Set<String>,
    ) {
        val complete: Boolean = missingCases.isEmpty()
    }

    private data class CaseComparison(
        val current: BenchmarkCase,
        val reference: BenchmarkCase?,
        val status: CaseStatus,
    )

    private enum class CaseStatus(val label: String, val css: String) {
        STABLE("СТАБИЛЬНО", "status-cell-stable"),
        IMPROVEMENT("УЛУЧШЕНИЕ", "status-cell-good"),
        REGRESSION("РЕГРЕССИЯ", "status-cell-bad"),
        NO_REFERENCE("НЕТ РЕФЕРЕНСА", "status-cell-warning"),
        INCOMPATIBLE("НЕСОВМЕСТИМО", "status-cell-warning"),
    }

    private companion object {
        val GSON = GsonBuilder().setPrettyPrinting().create()
        val CORE_CASES = linkedMapOf(
            "componentsFeedScrolling" to "Прокрутка ленты компонентов",
            "massStateUpdate" to "Массовое обновление состояния",
            "modalInteractionCycle" to "Цикл взаимодействия с Modal",
            "popoverTriggerInteractionCycle" to "Цикл взаимодействия с Popover",
            "popoverTriggersScrolling" to "Прокрутка списка Popover-триггеров",
            "bottomSheetWheelInteractionCycle" to "Цикл BottomSheet + Wheel",
            "tabsListBottomSheetFlow" to "Пользовательский путь Tabs → List → BottomSheet",
            "selectSortingFlow" to "Выбор сортировки через Select",
            "comboBoxSearchFlow" to "Поиск и выбор через ComboBox",
            "cellNotificationActionFlow" to "Действие Cell с подтверждением в Notification",
        )
        val SUPPORTED_CASES = CORE_CASES
    }
}
