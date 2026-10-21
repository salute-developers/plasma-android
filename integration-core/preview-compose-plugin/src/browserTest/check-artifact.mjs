// Проверяет состав и идентификацию распакованного production artifact без браузера: бэкенд DSB сверяет те же
// поля при публикации, поэтому расхождение лучше увидеть до отправки.
import {createHash} from "node:crypto";
import {existsSync, readFileSync, readdirSync} from "node:fs";
import {join} from "node:path";

const [artifactDirectory, expectedUikitComposeVersion] = process.argv.slice(2);
const problems = [];
const problem = (text) => problems.push(text);

const read = (name) => {
    const path = join(artifactDirectory, name);
    if (!existsSync(path)) {
        problem(`В артефакте нет файла ${name}`);
        return null;
    }
    return readFileSync(path);
};

const files = existsSync(artifactDirectory) ? readdirSync(artifactDirectory) : [];
if (!files.some((file) => file.endsWith(".wasm"))) problem("В артефакте нет ни одного .wasm файла");
if (!files.some((file) => file.endsWith(".js"))) problem("В артефакте нет JavaScript загрузчика");
read("index.html");

const manifestBytes = read("preview-plugin.json");
const metaBytes = read("api-meta.json");
if (manifestBytes && metaBytes) {
    const manifest = JSON.parse(manifestBytes.toString("utf8"));
    if (!/^[0-9a-f]{40}$/.test(manifest.commit ?? "")) problem(`commit не является sha коммита: ${manifest.commit}`);
    if (manifest.version !== String(manifest.commit).slice(0, 12)) {
        problem(`version ${manifest.version} не равна первым 12 символам commit ${manifest.commit}`);
    }
    if (!/^\d+\.\d+\.\d+([-+][0-9A-Za-z.-]+)?$/.test(manifest.uikitComposeVersion ?? "")) {
        problem(`uikitComposeVersion не является семантической версией: ${manifest.uikitComposeVersion}`);
    }
    if (expectedUikitComposeVersion && manifest.uikitComposeVersion !== expectedUikitComposeVersion) {
        problem(`uikitComposeVersion ${manifest.uikitComposeVersion}, а gradle.properties uikit-compose даёт ${expectedUikitComposeVersion}`);
    }
    const actual = createHash("sha256").update(metaBytes).digest("hex");
    if (manifest.apiMetaSha256 !== actual) {
        problem(`apiMetaSha256 ${manifest.apiMetaSha256} не совпадает с sha256 файла api-meta.json ${actual}`);
    }
    try {
        const meta = JSON.parse(metaBytes.toString("utf8"));
        if (!Array.isArray(meta) || meta.length === 0) problem("api-meta.json пуст или не является массивом");
    } catch (error) {
        problem(`api-meta.json не является JSON: ${error.message}`);
    }
    if (manifest.entrypoint && !files.includes(manifest.entrypoint)) {
        problem(`entrypoint ${manifest.entrypoint} отсутствует в артефакте`);
    }
}

if (problems.length) {
    console.error(`Artifact check failed:\n- ${problems.join("\n- ")}`);
    process.exit(1);
}
console.log("Artifact check passed");
