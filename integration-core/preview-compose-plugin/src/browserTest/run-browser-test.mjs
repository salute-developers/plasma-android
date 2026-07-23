import {createServer} from "node:http";
import {mkdtempSync, readFileSync, rmSync, statSync} from "node:fs";
import {tmpdir} from "node:os";
import {extname, join, normalize} from "node:path";
import {spawn} from "node:child_process";

const [artifactDirectory, testResources, fontPath, chromePath] = process.argv.slice(2);
const roots = [artifactDirectory, testResources];
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

const server = createServer((request, response) => {
    const pathname = new URL(request.url, "http://localhost").pathname;
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

await listen(server);
const userDataDirectory = mkdtempSync(join(tmpdir(), "preview-browser-test-"));
let chrome;
try {
    const {port} = server.address();
    const debugPort = await freePort();
    chrome = spawn(chromePath, [
        "--headless=new",
        "--disable-gpu",
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
    socket.close();
    const result = JSON.parse(resultText);
    console.log(JSON.stringify(result));
    if (result.status !== "passed") {
        throw new Error(result.message || "Browser test failed");
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
