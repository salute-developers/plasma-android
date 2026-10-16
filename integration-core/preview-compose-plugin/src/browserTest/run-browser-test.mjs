import {createServer} from "node:http";
import {mkdirSync, mkdtempSync, readFileSync, rmSync, statSync, writeFileSync} from "node:fs";
import {tmpdir} from "node:os";
import {extname, join, normalize} from "node:path";
import {spawn} from "node:child_process";
import {colourStatistics, decodePng} from "./png.mjs";

const [artifactDirectory, testResources, fontPath, chromePath, galleryDirectory, apiMetaDirectory] =
    process.argv.slice(2);
const roots = [artifactDirectory, testResources, apiMetaDirectory].filter(Boolean);
const mimeTypes = {
    ".html": "text/html; charset=utf-8",
    ".js": "text/javascript; charset=utf-8",
    ".json": "application/json; charset=utf-8",
    ".wasm": "application/wasm",
    ".otf": "font/otf",
};

function resolveFile(pathname) {
    if (pathname === "/test-assets/font.otf" || pathname === "/slow-font.otf") return fontPath;
    const relative = normalize(decodeURIComponent(pathname)).replace(/^(\.\.(\/|\\|$))+/, "").replace(/^\//, "");
    for (const root of roots) {
        const candidate = join(root, relative || "index.html");
        try {
            if (statSync(candidate).isFile()) return candidate;
        } catch (_) {
            // Continue with the next root.
        }
    }
    return null;
}

// Сколько раз скачан шрифт галереи: плагин должен переиспользовать его между payload.
let fontRequests = 0;

const server = createServer((request, response) => {
    const pathname = new URL(request.url, "http://localhost").pathname;
    if (pathname === "/test-assets/font.otf") fontRequests += 1;
    const file = resolveFile(pathname);
    if (!file) {
        response.writeHead(404);
        response.end("Not found");
        return;
    }
    const send = () => {
        response.writeHead(200, {
            "Content-Type": mimeTypes[extname(file)] || "application/octet-stream",
            "Access-Control-Allow-Origin": "*",
        });
        response.end(readFileSync(file));
    };
    if (pathname === "/slow-font.otf") setTimeout(send, 500);
    else send();
});

function listen(server) {
    return new Promise((resolve) => server.listen(0, "127.0.0.1", resolve));
}

function delay(milliseconds) {
    return new Promise((resolve) => setTimeout(resolve, milliseconds));
}

async function freePort() {
    const probe = createServer();
    await listen(probe);
    const port = probe.address().port;
    await new Promise((resolve) => probe.close(resolve));
    return port;
}

async function connectToPage(debugPort) {
    for (let attempt = 0; attempt < 120; attempt += 1) {
        try {
            const targets = await fetch(`http://127.0.0.1:${debugPort}/json`).then((response) => response.json());
            const page = targets.find((target) => target.type === "page");
            if (page) return new WebSocket(page.webSocketDebuggerUrl);
        } catch (_) {
            // Chrome is still starting.
        }
        await delay(250);
    }
    throw new Error("Chrome DevTools endpoint did not become ready");
}

function open(socket) {
    return new Promise((resolve, reject) => {
        socket.addEventListener("open", resolve, {once: true});
        socket.addEventListener("error", reject, {once: true});
    });
}

let commandId = 0;
function evaluate(socket, expression) {
    return new Promise((resolve, reject) => {
        const id = ++commandId;
        const onMessage = (event) => {
            const message = JSON.parse(event.data);
            if (message.id !== id) return;
            socket.removeEventListener("message", onMessage);
            if (message.error) reject(new Error(message.error.message));
            else resolve(message.result.result.value);
        };
        socket.addEventListener("message", onMessage);
        socket.send(JSON.stringify({
            id,
            method: "Runtime.evaluate",
            params: {expression, returnByValue: true},
        }));
    });
}

function cdp(socket, method, params = {}, awaitPromise = false) {
    return new Promise((resolve, reject) => {
        const id = ++commandId;
        const onMessage = (event) => {
            const message = JSON.parse(event.data);
            if (message.id !== id) return;
            socket.removeEventListener("message", onMessage);
            if (message.error) reject(new Error(`${method}: ${message.error.message}`));
            else resolve(message.result);
        };
        socket.addEventListener("message", onMessage);
        socket.send(JSON.stringify({id, method, params: awaitPromise ? {...params, awaitPromise: true} : params}));
    });
}

async function evaluateAsync(socket, expression) {
    const result = await cdp(socket, "Runtime.evaluate", {expression, returnByValue: true}, true);
    if (result.exceptionDetails) throw new Error(result.exceptionDetails.exception?.description || "evaluate failed");
    return result.result.value;
}

/** Истории, которые рисуют кнопку-триггер: содержимое (попап, шторка, уведомление) появляется после клика. */
const TRIGGER_COMPONENTS = new Set(["Modal", "ModalBottomSheet", "Popover", "Tooltip", "Toast", "Notification"]);

/** Группы компонентов с одинаковым кадром по умолчанию: общий стиль (TextArea и TextField, CheckBox и RadioBox). */
const IDENTICAL_FRAMES = [
    ["TextArea", "TextField"],
    ["CheckBox", "RadioBox"],
    // Истории Modal, Notification, Toast и Tooltip до клика показывают одну и ту же кнопку «show».
    ["Modal", "Notification", "Toast", "Tooltip"],
];

function escapeHtml(text) {
    return String(text).replace(/[&<>"]/g, (char) => ({"&": "&amp;", "<": "&lt;", ">": "&gt;", '"': "&quot;"}[char]));
}

/**
 * Галерея: отрисовывает каждый компонент из manifest с пробными значениями свойств из api-меты, проверяет успех,
 * отсутствие предупреждений и непустой кадр, сохраняет скриншоты и страницу для просмотра.
 * Падает со списком ВСЕХ проблемных компонентов, а не только первого.
 */
async function runGallery(socket, port) {
    mkdirSync(galleryDirectory, {recursive: true});
    await cdp(socket, "Page.navigate", {url: `http://127.0.0.1:${port}/gallery.html`});
    let componentIds;
    for (let attempt = 0; attempt < 240 && !Array.isArray(componentIds); attempt += 1) {
        await delay(250);
        try {
            componentIds = await evaluateAsync(socket, "window.__galleryReady || null");
        } catch (_) {
            componentIds = undefined;
        }
        const pageState = await evaluate(socket, "document.getElementById('result')?.textContent || ''");
        if (pageState.startsWith("failed")) throw new Error(`Gallery page failed to start: ${pageState}`);
    }
    if (!Array.isArray(componentIds)) throw new Error("Gallery page did not become ready");
    // Исключение при композиции не возвращается результатом (успех отправляется после применения состояния),
    // поэтому ошибки страницы собираются отдельно и приписываются компоненту, который рисовался.
    await cdp(socket, "Runtime.enable");
    let pageErrors = [];
    socket.addEventListener("message", (event) => {
        const message = JSON.parse(event.data);
        if (message.method === "Runtime.exceptionThrown") {
            const details = message.params.exceptionDetails;
            pageErrors.push(details.exception?.description || details.text);
        } else if (message.method === "Runtime.consoleAPICalled" && message.params.type === "error") {
            pageErrors.push(message.params.args.map((arg) => arg.value ?? arg.description).join(" "));
        }
    });
    const fontRequestsBeforeGallery = fontRequests;
    const cards = [];
    const issues = [];
    let previousShot = null;
    let identicalInRow = 0;
    const shots = new Map();

    const capture = async () => {
        const shot = await cdp(socket, "Page.captureScreenshot", {
            format: "png",
            clip: {x: 0, y: 0, width: 480, height: 320, scale: 1},
        });
        return Buffer.from(shot.data, "base64");
    };
    // `success` приходит до отрисовки: ждём, пока кадр перестанет меняться (два одинаковых снимка подряд), но не дольше 6 с.
    const stableShot = async () => {
        let previous = await capture();
        for (let attempt = 0; attempt < 30; attempt += 1) {
            await delay(200);
            const next = await capture();
            if (next.equals(previous)) return next;
            previous = next;
        }
        return previous;
    };
    // Истории попап-компонентов рисуют только кнопку-триггер: содержимое появляется после клика в центр.
    const click = async (x, y) => {
        for (const type of ["mousePressed", "mouseReleased"]) {
            await cdp(socket, "Input.dispatchMouseEvent", {type, x, y, button: "left", clickCount: 1});
        }
    };

    // Для отладки одной проблемы: GALLERY_ONLY=Accordion,CheckBox ограничивает галерею перечисленными компонентами.
    const only = process.env.GALLERY_ONLY?.split(",").filter(Boolean);
    for (const componentId of only ? componentIds.filter((id) => only.includes(id)) : componentIds) {
        const rendered = await evaluateAsync(socket, `window.__galleryRender(${JSON.stringify(componentId)})`);
        const problems = [];
        const {result} = rendered;
        if (result.type !== "success") {
            problems.push(`${result.code}: ${result.message}`);
        } else if (result.warnings?.length) {
            problems.push(`предупреждения: ${result.warnings.map((w) => `${w.code} ${w.path ?? ""}`).join("; ")}`);
        }
        const png = await stableShot();
        // Ошибки страницы, пришедшие с прошлой проверки, принадлежат компоненту, который рисуется сейчас.
        const errors = pageErrors.splice(0);
        if (errors.length) problems.push(`ошибки страницы: ${errors.slice(0, 2).join(" | ").slice(0, 400)}`);
        // Два соседних компонента могут выглядеть одинаково (TextField и TextArea), но три подряд означают, что рендер встал.
        identicalInRow = previousShot !== null && previousShot.equals(png) ? identicalInRow + 1 : 0;
        if (identicalInRow >= 2) problems.push("три одинаковых кадра подряд (рендер мог остановиться)");
        previousShot = png;
        writeFileSync(join(galleryDirectory, `${componentId}.png`), png);
        shots.set(componentId, png);
        const statistics = colourStatistics(decodePng(png));
        if (result.type === "success" && statistics.colours < 2) problems.push("пустой кадр (один цвет)");

        let opened = null;
        if (TRIGGER_COMPONENTS.has(componentId) && result.type === "success") {
            await click(240, 160);
            await delay(600);
            opened = await stableShot();
            const openErrors = pageErrors.splice(0);
            if (openErrors.length) problems.push(`ошибки страницы после клика: ${openErrors.slice(0, 2).join(" | ").slice(0, 400)}`);
            writeFileSync(join(galleryDirectory, `${componentId}-open.png`), opened);
            if (opened.equals(png)) problems.push("после клика по триггеру кадр не изменился (содержимое не показано)");
            const openStatistics = colourStatistics(decodePng(opened));
            if (openStatistics.colours < 3) problems.push("после клика в кадре меньше трёх цветов");
        }
        // Пользователь нажимает на компонент прямо в превью: исключение в обработчике или при перерисовке
        // останавливает Compose, и дальше плагин не рисует. Поэтому после клика плагин должен оставаться живым.
        if (result.type === "success" && !TRIGGER_COMPONENTS.has(componentId)) {
            pageErrors.splice(0);
            await click(240, 160);
            await delay(500);
            const clickErrors = pageErrors.splice(0);
            if (clickErrors.length) problems.push(`ошибки страницы после клика: ${clickErrors.slice(0, 2).join(" | ").slice(0, 400)}`);
            const again = await evaluateAsync(socket, `window.__galleryRender(${JSON.stringify(componentId)})`);
            if (again.result.type !== "success") {
                problems.push(`после клика плагин перестал отвечать: ${again.result.code}: ${again.result.message}`);
            }
            pageErrors.splice(0);
        }
        if (problems.length) issues.push(`${componentId}: ${problems.join(" | ")}`);
        cards.push({componentId, problems, statistics, opened: opened !== null, propertyCount: rendered.propertyCount, styleCount: rendered.styleCount});
    }

    // Все payload галереи ссылаются на один и тот же шрифт: после первой загрузки его не скачивают повторно.
    const galleryFontRequests = fontRequests - fontRequestsBeforeGallery;
    if (galleryFontRequests > 1) {
        issues.push(`шрифт скачан ${galleryFontRequests} раз за ${cards.length} payload (ожидалась одна загрузка)`);
    }

    // Стили и текст по умолчанию из payload не ломают render истории со вспомогательными элементами.
    if (!only || only.includes("DropZone")) {
        const withDefaults = await evaluateAsync(socket, `window.__galleryRenderWithHostDefaults("DropZone")`);
        if (withDefaults.type !== "success" || withDefaults.warnings?.length) {
            issues.push(`DropZone со стилями по умолчанию: ожидался success без предупреждений, получено ${JSON.stringify(withDefaults)}`);
        }
    }
    // Иконка, которой нет в реестре плагина, не останавливает Compose: компонент рисуется, а результат предупреждает.
    if (!only || only.includes("AccordionItem")) {
        const unknownIcon = await evaluateAsync(
            socket,
            `window.__galleryRenderWithProperty("AccordionItem", "closedIcon", {type: "literal", value: "no.such.icon.16"})`,
        );
        if (unknownIcon.type !== "success" || !unknownIcon.warnings?.some((w) => w.code === "unknown_icon")) {
            issues.push(`AccordionItem с неизвестной иконкой: ожидались success и unknown_icon, получено ${JSON.stringify(unknownIcon)}`);
        }
    }
    // Конфигурация может не содержать `textStyle`: TextSkeleton всё равно должен нарисоваться, а не остановить Compose.
    if (!only || only.includes("TextSkeleton")) {
        const withoutTextStyle = await evaluateAsync(socket, `window.__galleryRenderWithout("TextSkeleton", "textStyle")`);
        if (withoutTextStyle.type !== "success") {
            issues.push(`TextSkeleton без textStyle: ${withoutTextStyle.type}/${withoutTextStyle.code ?? ""} ${withoutTextStyle.message ?? ""}`);
        }
    }

    // Остановившийся Compose не должен сообщать успех (последний шаг: после него плагин мёртв).
    const crash = await evaluateAsync(socket, "window.__galleryCrash()");
    if (crash.first.type !== "failure" || crash.first.code !== "render_crashed") {
        issues.push(`сбой layout: ожидался отказ render_crashed, получено ${crash.first.type}/${crash.first.code ?? ""} ${crash.first.message ?? ""}`);
    }
    if (crash.second.type !== "failure" || crash.second.code !== "plugin_crashed") {
        issues.push(`после сбоя: ожидался отказ plugin_crashed, получено ${crash.second.type}/${crash.second.code ?? ""}`);
    }
    // Причина сбоя доходит до хоста: stack или запись консоли, одинаковые у первого и последующих отказов.
    for (const [name, result] of [["render_crashed", crash.first], ["plugin_crashed", crash.second]]) {
        if (!result.details || (!result.details.stack && !result.details.consoleError)) {
            issues.push(`${name}: в отказе нет details.stack и details.consoleError (${result.message ?? ""})`);
        }
    }
    if (!/Constraints/.test(crash.first.message) || !/Constraints/.test(crash.first.details?.consoleError ?? "")) {
        issues.push(`render_crashed: ожидалась причина сбоя layout (Constraints), получено ${crash.first.message}`);
    }
    if (JSON.stringify(crash.first.details) !== JSON.stringify(crash.second.details)) {
        issues.push("plugin_crashed отдаёт details, отличные от первого сбоя");
    }

    // Одинаковые кадры у разных компонентов допустимы только из списка (общий стиль или общая история-триггер).
    const byContent = new Map();
    for (const [componentId, png] of shots) {
        const key = png.toString("base64");
        byContent.set(key, [...(byContent.get(key) ?? []), componentId]);
    }
    for (const group of byContent.values()) {
        if (group.length < 2) continue;
        const allowed = IDENTICAL_FRAMES.some((expected) => expected.length === group.length && expected.every((id) => group.includes(id)));
        if (!allowed) issues.push(`${group.join(", ")}: одинаковые кадры у разных компонентов вне списка допустимых`);
    }
    const html = `<!doctype html><meta charset="utf-8"><title>Compose preview gallery</title>
<style>body{font:14px sans-serif;margin:16px}.grid{display:flex;flex-wrap:wrap;gap:12px}
.card{width:240px;border:1px solid #ccc;border-radius:6px;padding:6px}.bad{border-color:#c00;background:#fff0f0}
img{width:100%;image-rendering:auto;border:1px solid #eee}small{color:#555;display:block}</style>
<h1>Compose preview: ${cards.length} компонентов, проблем: ${issues.length}</h1>
<div class="grid">${cards.map((card) => `<div class="card${card.problems.length ? " bad" : ""}">
<b>${escapeHtml(card.componentId)}</b><img src="${escapeHtml(card.componentId)}.png" alt="">
<small>свойств: ${card.propertyCount}, вложенных стилей: ${card.styleCount}, цветов в кадре: ${card.statistics.colours}</small>
${card.opened ? `<img src="${escapeHtml(card.componentId)}-open.png" alt=""><small>после клика по триггеру</small>` : ""}
${card.problems.map((problem) => `<small style="color:#c00">${escapeHtml(problem)}</small>`).join("")}</div>`).join("")}</div>`;
    writeFileSync(join(galleryDirectory, "index.html"), html);
    writeFileSync(join(galleryDirectory, "results.json"), JSON.stringify({cards, issues}, null, 2));
    console.log(JSON.stringify({gallery: {components: cards.length, issues: issues.length, directory: galleryDirectory}}));
    if (issues.length) throw new Error(`Gallery found problems in ${issues.length} components:\n${issues.join("\n")}`);
}

await listen(server);
const userDataDirectory = mkdtempSync(join(tmpdir(), "preview-browser-test-"));
let chrome;
try {
    const {port} = server.address();
    const debugPort = await freePort();
    chrome = spawn(chromePath, [
        "--headless=new",
        // Compose рисует в WebGL-холст; без программного рендерера он не попадает в скриншот.
        "--use-angle=swiftshader",
        "--enable-unsafe-swiftshader",
        "--ignore-gpu-blocklist",
        "--no-sandbox",
        `--remote-debugging-port=${debugPort}`,
        `--user-data-dir=${userDataDirectory}`,
        `http://127.0.0.1:${port}/browser-test.html`,
    ]);
    let stderr = "";
    chrome.stderr.on("data", (chunk) => stderr += chunk);

    const socket = await connectToPage(debugPort);
    await open(socket);
    let resultText = "running";
    for (let attempt = 0; attempt < 120 && resultText === "running"; attempt += 1) {
        resultText = await evaluate(
            socket,
            "document.getElementById('result')?.textContent || 'running'",
        );
        if (resultText === "running") await delay(250);
    }
    if (resultText === "running") {
        const diagnostics = await evaluate(
            socket,
            `JSON.stringify({
                iframeBody: document.getElementById("plugin")?.contentDocument?.body?.innerText,
                directApi: typeof document.getElementById("plugin")?.contentWindow?.submitPreviewPayload,
                readyCallback: typeof document.getElementById("plugin")?.contentWindow?.__sddsPreviewReady,
                kotlinApi: typeof document.getElementById("plugin")?.contentWindow?.["preview-compose-plugin"]
            })`,
        );
        socket.close();
        throw new Error(`Browser test timed out: ${diagnostics}\n${stderr}`);
    }
    const result = JSON.parse(resultText);
    console.log(JSON.stringify(result));
    if (result.status !== "passed") {
        socket.close();
        throw new Error(result.message || "Browser test failed");
    }
    try {
        if (galleryDirectory) await runGallery(socket, port);
    } finally {
        socket.close();
    }
} finally {
    if (chrome && chrome.exitCode === null) {
        const closed = new Promise((resolve) => chrome.once("close", resolve));
        chrome.kill();
        await closed;
    }
    await new Promise((resolve) => server.close(resolve));
    rmSync(userDataDirectory, {recursive: true, force: true, maxRetries: 5, retryDelay: 100});
}
