import {createHash} from 'node:crypto';

/** Идентификатор зависит от базового коммита и версии Core, но не от канала загрузки. */
export const previewBuildId = (commit, libraryId, platform, version) =>
    createHash('sha256').update([commit, libraryId, platform, version].join('\n')).digest('hex').slice(0, 12);

/** Определяет координаты сборки; канал выбирает вызывающий CLI при загрузке. */
export function resolveCoreRelease({version, baseVersion, commit, actualCommit}) {
    if (!/^[0-9a-f]{40}$/.test(commit ?? '') || commit !== actualCommit) {
        throw new Error('previewCommit должен совпадать с настоящим HEAD исходников');
    }
    if (!/^\d+\.\d+\.\d+$/.test(baseVersion ?? '')) throw new Error('Некорректная базовая версия UIKit');
    const selected = version || `${baseVersion}-dev.${commit}`;
    if (!/^\d+\.\d+\.\d+([-+][0-9A-Za-z.-]+)?$/.test(selected)) {
        throw new Error('coreVersion должна быть семантической версией');
    }
    return {version: selected, libraryId: 'uikit-compose', platform: 'compose',
        buildId: previewBuildId(commit, 'uikit-compose', 'compose', selected)};
}

if (process.argv[2] === '--resolve') {
    try { console.log(JSON.stringify(resolveCoreRelease(JSON.parse(process.argv[3])))); }
    catch (error) { console.error(error.message); process.exitCode = 1; }
}
