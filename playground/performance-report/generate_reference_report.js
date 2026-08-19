(() => {
    "use strict";

    const expectedCases = new Map([
        ["componentsFeedScrolling", "Components feed scrolling"],
        ["massStateUpdate", "Mass state update"],
        ["modalInteractionCycle", "Modal interaction cycle"],
        ["popoverTriggerInteractionCycle", "Popover trigger interaction cycle"],
        ["bottomSheetWheelInteractionCycle", "BottomSheet + Wheel interaction cycle"],
    ]);
    const requiredMetrics = {
        frameCount: ["minimum", "median", "maximum"],
        frameDurationCpuMs: ["P50", "P90", "P95", "P99"],
        frameOverrunMs: ["P50", "P90", "P95", "P99"],
    };
    const state = { snapshot: null, saving: false };
    const elements = {
        artifactFiles: requiredElement("#artifactFiles"),
        label: requiredElement("#label"),
        branch: requiredElement("#branch"),
        commit: requiredElement("#commit"),
        saveFolder: requiredElement("#saveFolder"),
        downloadHtml: requiredElement("#downloadHtml"),
        downloadJson: requiredElement("#downloadJson"),
        status: requiredElement("#status"),
        saveHelp: requiredElement("#saveHelp"),
        preview: requiredElement("#preview"),
    };

    function requiredElement(selector) {
        const element = document.querySelector(selector);
        if (!element) throw new Error(`Missing required element: ${selector}`);
        return element;
    }

    function canonicalCaseName(rawName) {
        for (const name of expectedCases.keys()) {
            if (rawName === name || rawName.endsWith(`_${name}`)) return name;
        }
        return null;
    }

    function metricSummary(metric) {
        const result = {};
        if (!metric || typeof metric !== "object") return result;
        for (const key of ["minimum", "median", "maximum", "coefficientOfVariation", "P50", "P90", "P95", "P99"]) {
            if (typeof metric[key] === "number") result[key] = metric[key];
        }
        return result;
    }

    function numericRuns(metric) {
        if (!metric || !Array.isArray(metric.runs)) return [];
        return metric.runs
            .filter(Array.isArray)
            .map((run) => run.filter((value) => typeof value === "number" && Number.isFinite(value)));
    }

    function percentile(values, fraction) {
        if (!values.length) return null;
        const sorted = [...values].sort((left, right) => left - right);
        const index = Math.max(0, Math.ceil(fraction * sorted.length) - 1);
        return sorted[index];
    }

    function iterationAnalysis(index, overrunValues, cpuValues, trace) {
        const jankFrameCount = overrunValues.filter((value) => value > 0).length;
        return {
            iteration: index,
            frameCount: overrunValues.length,
            jankFrameCount,
            jankRatePercent: overrunValues.length ? jankFrameCount * 100 / overrunValues.length : null,
            frameOverrunMs: {
                P50: percentile(overrunValues, 0.50),
                P95: percentile(overrunValues, 0.95),
                P99: percentile(overrunValues, 0.99),
                maximum: overrunValues.length ? Math.max(...overrunValues) : null,
            },
            frameDurationCpuMs: {
                P95: percentile(cpuValues, 0.95),
            },
            trace,
        };
    }

    function caseAnalysis(iterations) {
        const measured = iterations.filter((iteration) => iteration.frameCount > 0);
        const totalFrames = measured.reduce((sum, iteration) => sum + iteration.frameCount, 0);
        const jankFrameCount = measured.reduce((sum, iteration) => sum + iteration.jankFrameCount, 0);
        const worst = [...measured].sort((left, right) =>
            numberOrMinusInfinity(right.frameOverrunMs.P95) - numberOrMinusInfinity(left.frameOverrunMs.P95)
        )[0] ?? null;
        return {
            totalFrames,
            jankFrameCount,
            jankRatePercent: totalFrames ? jankFrameCount * 100 / totalFrames : null,
            worstIteration: worst?.iteration ?? null,
            worstIterationOverrunP95: worst?.frameOverrunMs.P95 ?? null,
            recommendedTrace: worst?.trace ?? null,
        };
    }

    function numberOrMinusInfinity(value) {
        return typeof value === "number" ? value : Number.NEGATIVE_INFINITY;
    }

    function validateMetrics(testCase) {
        for (const [metricName, keys] of Object.entries(requiredMetrics)) {
            const metric = testCase.metrics[metricName];
            const missing = keys.filter((key) => !(key in metric));
            if (missing.length) {
                throw new Error(`Reference неполный: ${testCase.name}/${metricName} не содержит ${missing.join(", ")}.`);
            }
        }
    }

    function deviceIdentity(context) {
        const build = context?.build ?? {};
        return [build.brand, build.device, build.model, build.fingerprint].join("|");
    }

    function basename(path) {
        return String(path).replaceAll("\\", "/").split("/").pop() ?? String(path);
    }

    function outputIteration(output) {
        const match = String(output.label ?? "").match(/(\d+)$/);
        return match ? Number(match[1]) : Number.MAX_SAFE_INTEGER;
    }

    function findTraceFile(traceFiles, expectedName) {
        return traceFiles.get(expectedName) ?? [...traceFiles.values()]
            .find((file) => file.name.endsWith(`-${expectedName}`));
    }

    async function createSnapshot(files) {
        const jsonFiles = files.filter((file) => file.name.endsWith("benchmarkData.json"));
        if (!jsonFiles.length) throw new Error("В выбранной папке не найден *benchmarkData.json.");
        const traceFiles = new Map(files
            .filter((file) => file.name.endsWith(".perfetto-trace"))
            .map((file) => [file.name, file]));
        const cases = new Map();
        let context = null;
        let identity = null;

        for (const jsonFile of jsonFiles) {
            const payload = JSON.parse(await jsonFile.text());
            if (!Array.isArray(payload.benchmarks)) continue;
            const currentIdentity = deviceIdentity(payload.context);
            if (context === null) {
                context = payload.context ?? {};
                identity = currentIdentity;
            } else if (currentIdentity !== identity) {
                throw new Error("Во входных файлах найдены разные устройства. Для каждого устройства нужен отдельный reference.");
            }

            for (const benchmark of payload.benchmarks) {
                const name = canonicalCaseName(String(benchmark.name ?? ""));
                if (!name) continue;
                if (cases.has(name)) throw new Error(`Найден дубликат результата ${name}.`);
                const testCase = {
                    name,
                    rawName: String(benchmark.name),
                    displayName: expectedCases.get(name),
                    repeatIterations: benchmark.repeatIterations ?? null,
                    thermalThrottleSleepSeconds: benchmark.thermalThrottleSleepSeconds ?? 0,
                    totalRunTimeNs: benchmark.totalRunTimeNs ?? null,
                    metrics: {
                        frameCount: metricSummary(benchmark.metrics?.frameCount),
                        frameDurationCpuMs: metricSummary(benchmark.sampledMetrics?.frameDurationCpuMs),
                        frameOverrunMs: metricSummary(benchmark.sampledMetrics?.frameOverrunMs),
                    },
                    overrunRuns: numericRuns(benchmark.sampledMetrics?.frameOverrunMs),
                    cpuRuns: numericRuns(benchmark.sampledMetrics?.frameDurationCpuMs),
                    profilerOutputs: Array.isArray(benchmark.profilerOutputs) ? benchmark.profilerOutputs : [],
                    sourceJson: jsonFile,
                };
                validateMetrics(testCase);
                cases.set(name, testCase);
            }
        }

        const present = [...expectedCases.keys()].filter((name) => cases.has(name));
        const missing = [...expectedCases.keys()].filter((name) => !cases.has(name));
        if (!present.length) {
            throw new Error(`В JSON не найден ни один поддерживаемый кейс: ${[...expectedCases.keys()].join(", ")}.`);
        }

        const traceCopies = [];
        const normalizedCases = [];
        for (const name of present) {
            const testCase = cases.get(name);
            const profilerOutputs = [...testCase.profilerOutputs].sort((left, right) => outputIteration(left) - outputIteration(right));
            if (!profilerOutputs.length) throw new Error(`Для ${name} в JSON не объявлены Perfetto traces.`);
            const traces = profilerOutputs.map((output, index) => {
                const expectedName = basename(output.filename ?? "");
                const traceFile = findTraceFile(traceFiles, expectedName);
                if (!traceFile) throw new Error(`Не найден Perfetto trace: ${output.filename}`);
                const target = `traces/${name}-${index}-${expectedName}`;
                traceCopies.push({ file: traceFile, target });
                return target;
            });
            const iterationCount = Math.max(traces.length, testCase.overrunRuns.length, testCase.cpuRuns.length);
            const iterations = Array.from({ length: iterationCount }, (_, index) => iterationAnalysis(
                index,
                testCase.overrunRuns[index] ?? [],
                testCase.cpuRuns[index] ?? [],
                traces[index] ?? null,
            ));
            normalizedCases.push({
                name: testCase.rawName,
                canonicalName: name,
                displayName: testCase.displayName,
                repeatIterations: testCase.repeatIterations,
                thermalThrottleSleepSeconds: testCase.thermalThrottleSleepSeconds,
                totalRunTimeNs: testCase.totalRunTimeNs,
                metrics: testCase.metrics,
                analysis: caseAnalysis(iterations),
                iterations,
                traces,
                sourceJson: testCase.sourceJson.name,
            });
        }

        return {
            reference: {
                schemaVersion: 3,
                label: metadata().label,
                generatedAtUtc: new Date().toISOString(),
                git: metadata().git,
                suite: {
                    complete: missing.length === 0,
                    expectedCaseCount: expectedCases.size,
                    presentCaseCount: present.length,
                    presentCases: present,
                    missingCases: missing,
                },
                context: context ?? {},
                cases: normalizedCases,
            },
            jsonFiles,
            traceCopies,
        };
    }

    function metadata() {
        return {
            label: elements.label.value.trim() || "performance reference",
            git: {
                branch: elements.branch.value.trim() || null,
                commit: elements.commit.value.trim() || null,
            },
        };
    }

    function applyMetadata() {
        if (!state.snapshot) return;
        const current = metadata();
        state.snapshot.reference.label = current.label;
        state.snapshot.reference.git = current.git;
        renderPreview();
    }

    function escapeHtml(value) {
        return String(value ?? "—")
            .replaceAll("&", "&amp;")
            .replaceAll("<", "&lt;")
            .replaceAll(">", "&gt;")
            .replaceAll('"', "&quot;")
            .replaceAll("'", "&#039;");
    }

    function formatNumber(value, digits = 1) {
        return typeof value === "number" ? value.toFixed(digits) : "—";
    }

    function formatSigned(value) {
        if (typeof value !== "number") return "—";
        return `${value > 0 ? "+" : ""}${value.toFixed(1)} мс`;
    }

    function formatPercent(value) {
        return typeof value === "number" ? `${value.toFixed(1)}%` : "—";
    }

    function caseExplanation(testCase) {
        const p50 = testCase.metrics.frameOverrunMs.P50;
        const p95 = testCase.metrics.frameOverrunMs.P95;
        const typical = p50 > 0
            ? `Типичный кадр опаздывает примерно на ${formatNumber(p50)} мс.`
            : `Типичный кадр укладывается в дедлайн с запасом ${formatNumber(Math.abs(p50))} мс.`;
        const tail = p95 > 0
            ? `В медленном хвосте есть jank: P95 ${formatSigned(p95)}.`
            : `Не менее 95% кадров укладываются в дедлайн.`;
        return `${typical} ${tail}`;
    }

    function environmentWarnings(reference) {
        const warnings = [];
        if (reference.context?.compilationMode === "run-from-apk") {
            warnings.push("JSON сообщает compilationMode = run-from-apk. Сравнивайте только прогоны с одинаковым compilation state и проверьте соответствие ожидаемому CompilationMode.Full.");
        }
        if (reference.context?.cpuLocked === false) {
            warnings.push("CPU не locked: частоты могут добавлять шум между прогонами.");
        }
        if (reference.cases.some((testCase) => testCase.thermalThrottleSleepSeconds > 0)) {
            warnings.push("Benchmark ожидал охлаждения устройства. Перед повторным прогоном проверьте температуру.");
        }
        return warnings.map((warning) => `<p class="warning">${escapeHtml(warning)}</p>`).join("");
    }

    function suiteStatus(reference) {
        const suite = reference.suite;
        if (!suite || suite.complete) {
            return `<p><strong>Полный прогон:</strong> присутствуют все ${expectedCases.size} кейсов.</p>`;
        }
        const missingNames = suite.missingCases
            .map((name) => expectedCases.get(name) ?? name)
            .join(", ");
        return `<p class="warning"><strong>Частичный прогон:</strong> загружено ${suite.presentCaseCount} из ` +
            `${suite.expectedCaseCount} кейсов. Отсутствуют: ${escapeHtml(missingNames)}. ` +
            `Отчёт пригоден для анализа загруженных кейсов, но не является полным reference всей suite.</p>`;
    }

    function summaryCards(reference) {
        const byP95 = [...reference.cases].sort((left, right) =>
            numberOrMinusInfinity(right.metrics.frameOverrunMs.P95) - numberOrMinusInfinity(left.metrics.frameOverrunMs.P95)
        );
        return byP95.map((testCase, rank) => {
            const analysis = testCase.analysis;
            const traceLink = analysis.recommendedTrace
                ? `<a href="${escapeHtml(analysis.recommendedTrace)}">Открыть trace итерации ${analysis.worstIteration}</a>`
                : "Trace не определён";
            return `<article class="summary-card"><h3>${rank + 1}. ${escapeHtml(testCase.displayName)}</h3>` +
                `<div class="metric">P95 ${escapeHtml(formatSigned(testCase.metrics.frameOverrunMs.P95))}</div>` +
                `<p>Jank-кадры: <strong>${escapeHtml(formatPercent(analysis.jankRatePercent))}</strong> ` +
                `(${escapeHtml(analysis.jankFrameCount)} из ${escapeHtml(analysis.totalFrames)}).</p>` +
                `<p>${escapeHtml(caseExplanation(testCase))}</p>` +
                `<p>Худшая итерация по P95: <strong>${escapeHtml(analysis.worstIteration)}</strong>, ` +
                `${escapeHtml(formatSigned(analysis.worstIterationOverrunP95))}. ${traceLink}</p></article>`;
        }).join("");
    }

    function aggregateTable(reference) {
        const rows = reference.cases.map((testCase) => {
            const count = testCase.metrics.frameCount;
            const cpu = testCase.metrics.frameDurationCpuMs;
            const overrun = testCase.metrics.frameOverrunMs;
            return `<tr><th>${escapeHtml(testCase.displayName)}</th>` +
                `<td>${formatNumber(testCase.repeatIterations, 0)}</td><td>${formatNumber(testCase.thermalThrottleSleepSeconds, 0)}</td>` +
                `<td>${formatNumber(count.minimum, 0)}</td><td>${formatNumber(count.median, 0)}</td><td>${formatNumber(count.maximum, 0)}</td>` +
                `<td>${formatNumber(count.coefficientOfVariation, 3)}</td>` +
                `<td>${formatNumber(cpu.P50)}</td><td>${formatNumber(cpu.P90)}</td><td>${formatNumber(cpu.P95)}</td><td>${formatNumber(cpu.P99)}</td>` +
                `<td>${formatNumber(overrun.P50)}</td><td>${formatNumber(overrun.P90)}</td><td>${formatNumber(overrun.P95)}</td><td>${formatNumber(overrun.P99)}</td></tr>`;
        }).join("");
        return `<div class="scroll"><table><thead><tr><th rowspan="2">Кейс</th><th rowspan="2">Итерации</th>` +
            `<th rowspan="2">Thermal sleep, с</th><th colspan="4">frameCount</th><th colspan="4">frameDurationCpuMs</th>` +
            `<th colspan="4">frameOverrunMs</th></tr><tr><th>min</th><th>median</th><th>max</th><th>CV</th>` +
            `<th>P50</th><th>P90</th><th>P95</th><th>P99</th><th>P50</th><th>P90</th><th>P95</th><th>P99</th>` +
            `</tr></thead><tbody>${rows}</tbody></table></div>`;
    }

    function iterationTable(reference) {
        const rows = reference.cases.flatMap((testCase) => testCase.iterations.map((iteration) => {
            const trace = iteration.trace
                ? `<a href="${escapeHtml(iteration.trace)}">trace ${iteration.iteration}</a>`
                : "—";
            return `<tr><th>${escapeHtml(testCase.displayName)}</th><td>${iteration.iteration}</td>` +
                `<td>${iteration.frameCount}</td><td>${iteration.jankFrameCount}</td><td>${formatPercent(iteration.jankRatePercent)}</td>` +
                `<td>${formatNumber(iteration.frameOverrunMs.P50)}</td><td>${formatNumber(iteration.frameOverrunMs.P95)}</td>` +
                `<td>${formatNumber(iteration.frameOverrunMs.P99)}</td><td>${formatNumber(iteration.frameOverrunMs.maximum)}</td>` +
                `<td>${formatNumber(iteration.frameDurationCpuMs.P95)}</td><td>${trace}</td></tr>`;
        })).join("");
        return `<div class="scroll"><table><thead><tr><th>Кейс</th><th>Итерация</th><th>Кадры</th><th>Jank</th>` +
            `<th>Jank rate</th><th>Overrun P50</th><th>Overrun P95</th><th>Overrun P99</th><th>Overrun max</th>` +
            `<th>CPU P95</th><th>Perfetto</th></tr></thead><tbody>${rows}</tbody></table></div>`;
    }

    function reportMarkup(reference) {
        const build = reference.context?.build ?? {};
        return `<h1>${escapeHtml(reference.label)}</h1>` +
            `<p>Создан: ${escapeHtml(reference.generatedAtUtc)}<br>Ветка: <code>${escapeHtml(reference.git.branch)}</code><br>` +
            `Commit: <code>${escapeHtml(reference.git.commit)}</code></p>` +
            suiteStatus(reference) +
            `<h2>Что требует внимания</h2><p>Кейсы отсортированы по frameOverrunMs P95. Это показывает тяжесть ` +
            `медленного хвоста, но не является автоматическим pass/fail и не определяет причину без Perfetto.</p>` +
            `<div class="summary-grid">${summaryCards(reference)}</div>` +
            `<h2>Устройство и окружение</h2><table>` +
            `<tr><th>Устройство</th><td>${escapeHtml(`${build.brand ?? ""} ${build.model ?? ""}`.trim())}</td></tr>` +
            `<tr><th>Android SDK</th><td>${escapeHtml(build.version?.sdk)}</td></tr>` +
            `<tr><th>Fingerprint</th><td>${escapeHtml(build.fingerprint)}</td></tr>` +
            `<tr><th>CPU cores</th><td>${escapeHtml(reference.context.cpuCoreCount)}</td></tr>` +
            `<tr><th>CPU locked</th><td>${escapeHtml(reference.context.cpuLocked)}</td></tr>` +
            `<tr><th>Compilation mode</th><td>${escapeHtml(reference.context.compilationMode)}</td></tr></table>` +
            environmentWarnings(reference) +
            `<h2>Агрегированные метрики</h2>${aggregateTable(reference)}` +
            `<p><strong>Главный сигнал:</strong> frameOverrunMs P95. Положительное значение означает пропущенный дедлайн; ` +
            `отрицательное — оставшийся запас.</p>` +
            `<h2>Итерации и jank</h2><p>Jank rate рассчитан по сырым кадрам: доля значений frameOverrunMs &gt; 0. ` +
            `Он учитывает даже минимальное опоздание, например +0.1 мс, поэтому его нужно читать вместе с P95 и max. ` +
            `Худшая итерация выбирается по наибольшему P95 — с неё стоит начинать анализ в Perfetto.</p>` +
            iterationTable(reference) +
            `<p>Откройте trace через <a href="https://ui.perfetto.dev/">Perfetto UI</a>. Отчёт указывает проблемный кейс ` +
            `и итерацию, но точную причину — main thread, RenderThread, GPU или системное планирование — определяет только trace.</p>`;
    }

    function standaloneReport(reference) {
        const embeddedJson = JSON.stringify(reference).replaceAll("</script", "<\\/script");
        return `<!doctype html><html lang="ru"><head><meta charset="utf-8"><meta name="viewport" content="width=device-width,initial-scale=1">` +
            `<title>${escapeHtml(reference.label)} — performance reference</title><style>` +
            `:root{color-scheme:light dark;font-family:system-ui,sans-serif;--border:#8886;--warning:#b26a00}` +
            `*{box-sizing:border-box}body{max-width:1500px;margin:auto;padding:32px;line-height:1.45}h2{margin-top:32px}` +
            `.warning{border-left:4px solid var(--warning);padding:10px 14px;background:#b26a0015}` +
            `.summary-grid{display:grid;grid-template-columns:repeat(auto-fit,minmax(260px,1fr));gap:12px}` +
            `.summary-card{border:1px solid var(--border);border-radius:12px;padding:16px}.summary-card h3{margin:0 0 8px}` +
            `.metric{font-size:1.6rem;font-weight:700}.scroll{overflow-x:auto}` +
            `table{border-collapse:collapse;width:100%;margin:16px 0 32px}th,td{border:1px solid var(--border);padding:8px 10px;text-align:right;white-space:nowrap}` +
            `th:first-child,td:first-child{text-align:left}thead th{background:#8882}code{overflow-wrap:anywhere;white-space:normal}a{color:#6aa9ff}` +
            `</style></head><body>${reportMarkup(reference)}` +
            `<p class="warning">Автономный HTML содержит все метрики и выводы. Ссылки на traces работают только если рядом существует папка <code>traces/</code>.</p>` +
            `<script id="reference-data" type="application/json">${embeddedJson}<\/script></body></html>`;
    }

    function download(name, data, type) {
        const anchor = document.createElement("a");
        anchor.href = URL.createObjectURL(new Blob([data], { type }));
        anchor.download = name;
        anchor.click();
        setTimeout(() => URL.revokeObjectURL(anchor.href), 1000);
    }

    async function writeFile(directory, relativePath, data) {
        const parts = relativePath.split("/");
        let parent = directory;
        for (const part of parts.slice(0, -1)) parent = await parent.getDirectoryHandle(part, { create: true });
        const handle = await parent.getFileHandle(parts.at(-1), { create: true });
        const writable = await handle.createWritable();
        await writable.write(data);
        await writable.close();
    }

    function snapshotDirectoryName(reference) {
        const model = reference.context?.build?.model ?? "device";
        const timestamp = new Date().toISOString().replaceAll(":", "-").replace("T", "-").slice(0, 19);
        return `performance-reference-${model}-${timestamp}`.replaceAll(/[^a-zA-Z0-9._-]/g, "-");
    }

    function supportsDirectorySaving() {
        return typeof window.showDirectoryPicker === "function";
    }

    async function saveCompleteFolder() {
        if (!supportsDirectorySaving()) {
            throw new Error("Этот браузер не умеет записывать каталог. Скачайте автономный HTML или откройте генератор в актуальном Chrome/Edge.");
        }
        const parent = await window.showDirectoryPicker({ mode: "readwrite" });
        const folderName = snapshotDirectoryName(state.snapshot.reference);
        const directory = await parent.getDirectoryHandle(folderName, { create: true });
        const operations = [
            { target: "index.html", data: standaloneReport(state.snapshot.reference) },
            { target: "reference.json", data: JSON.stringify(state.snapshot.reference, null, 2) + "\n" },
            ...state.snapshot.jsonFiles.map((file, index) => ({
                target: `raw/${index === 0 ? file.name : `${index}-${file.name}`}`,
                data: file,
            })),
            ...state.snapshot.traceCopies.map((trace) => ({ target: trace.target, data: trace.file })),
        ];
        for (const [index, operation] of operations.entries()) {
            setStatus(`Сохранение ${index + 1}/${operations.length}: ${operation.target}`);
            await writeFile(directory, operation.target, operation.data);
        }
        return folderName;
    }

    function updateButtons() {
        const ready = Boolean(state.snapshot) && !state.saving;
        elements.saveFolder.disabled = !ready || !supportsDirectorySaving();
        elements.downloadHtml.disabled = !ready;
        elements.downloadJson.disabled = !ready;
        elements.saveHelp.textContent = supportsDirectorySaving()
            ? "Полный snapshot сохранит index.html, reference.json, исходный JSON и все traces. Для 25 traces потребуется записать около 1 ГБ."
            : "Полная запись каталога недоступна в этом браузере. Автономный HTML сохраняет метрики и выводы; traces останутся в исходной build-папке.";
    }

    function renderPreview() {
        elements.preview.innerHTML = state.snapshot ? reportMarkup(state.snapshot.reference) : "";
    }

    async function refreshSnapshot() {
        const files = [...elements.artifactFiles.files];
        if (!files.length) return;
        setStatus("Чтение и проверка артефактов…");
        try {
            state.snapshot = await createSnapshot(files);
            renderPreview();
            const suite = state.snapshot.reference.suite;
            const missing = suite.missingCases.map((name) => expectedCases.get(name) ?? name).join(", ");
            const suffix = suite.complete ? "" : ` Отсутствуют: ${missing}.`;
            setStatus(
                `Готово: ${suite.presentCaseCount} из ${suite.expectedCaseCount} кейсов, ` +
                `${state.snapshot.traceCopies.length} Perfetto traces.${suffix} Отчёт можно сохранить.`,
                suite.complete ? "success" : "warning",
            );
        } catch (error) {
            state.snapshot = null;
            renderPreview();
            setStatus(error instanceof Error ? error.message : String(error), "error");
        }
        updateButtons();
    }

    function setStatus(message, type = "") {
        elements.status.textContent = message;
        elements.status.className = `status ${type}`;
    }

    elements.artifactFiles.addEventListener("change", refreshSnapshot);
    for (const input of [elements.label, elements.branch, elements.commit]) input.addEventListener("input", applyMetadata);
    elements.downloadHtml.addEventListener("click", () => {
        download("performance-reference.html", standaloneReport(state.snapshot.reference), "text/html");
        setStatus("Автономный HTML передан браузеру для скачивания.", "success");
    });
    elements.downloadJson.addEventListener("click", () => {
        download("reference.json", JSON.stringify(state.snapshot.reference, null, 2) + "\n", "application/json");
        setStatus("reference.json передан браузеру для скачивания.", "success");
    });
    elements.saveFolder.addEventListener("click", async () => {
        try {
            state.saving = true;
            updateButtons();
            const folder = await saveCompleteFolder();
            setStatus(`Полный snapshot сохранён в папку ${folder}.`, "success");
        } catch (error) {
            if (!(error instanceof DOMException && error.name === "AbortError")) {
                setStatus(error instanceof Error ? error.message : String(error), "error");
            }
        } finally {
            state.saving = false;
            updateButtons();
        }
    });

    updateButtons();
})();
