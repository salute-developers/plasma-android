import {test} from 'node:test';
import assert from 'node:assert/strict';
import {mkdtempSync, writeFileSync, rmSync, unlinkSync} from 'node:fs';
import {tmpdir} from 'node:os';
import {join} from 'node:path';
import {fileURLToPath} from 'node:url';
import {spawnSync} from 'node:child_process';
import {createHash} from 'node:crypto';
const checker = fileURLToPath(new URL('./check-artifact.mjs', import.meta.url));
const sha = 'a'.repeat(40), meta = '[{"componentName":"Button"}]';
const manifest = {commit: sha, version: sha.slice(0,12), channel: 'stable', uikitComposeVersion: '1.2.3',
    coreRelease: {libraryId: 'uikit-compose', platform: 'compose', version: '1.2.3'}, entrypoint: 'index.html',
    apiMetaSha256: createHash('sha256').update(meta).digest('hex')};
const check = (patch = {}, change, actualCommit = sha) => {
    const directory = mkdtempSync(join(tmpdir(), 'core-validator-unit-'));
    try {
        for (const name of ['index.html', 'loader.js', 'unit-test.wasm']) writeFileSync(join(directory,name),'validator fixture');
        writeFileSync(join(directory,'api-meta.json'),meta);
        writeFileSync(join(directory,'preview-plugin.json'),JSON.stringify({...manifest,...patch}));
        change?.(directory);
        return spawnSync(process.execPath,[checker,directory,'1.2.3',actualCommit],{encoding:'utf8'});
    } finally {rmSync(directory,{recursive:true,force:true});}
};
test('artifact contract accepts matching coordinates and exact bytes', () => {
    const result = check(); assert.equal(result.status,0,result.stderr);
});
test('Core coordinates agree with producer independently of channel', () => {
    for (const patch of [{coreRelease:undefined},
        {coreRelease:{...manifest.coreRelease,libraryId:'other'}}, {coreRelease:{...manifest.coreRelease,platform:'web'}},
        {coreRelease:{...manifest.coreRelease,version:'1.2.4'}}]) assert.notEqual(check(patch).status,0);
});
test('source bytes, uppercase hash and incomplete browser files are rejected', () => {
    assert.notEqual(check({},d=>writeFileSync(join(d,'api-meta.json'),meta+' ')).status,0);
    assert.notEqual(check({apiMetaSha256:manifest.apiMetaSha256.toUpperCase()}).status,0);
    assert.notEqual(check({},d=>unlinkSync(join(d,'unit-test.wasm'))).status,0);
});

test('a valid old build ID is rejected against another actual source commit', () => {
    assert.notEqual(check({}, undefined, 'b'.repeat(40)).status, 0);
});

test('archive needs no publication channel', () => { const result=check({channel:undefined}); assert.equal(result.status,0,result.stderr); });
