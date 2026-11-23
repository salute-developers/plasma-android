import {test} from 'node:test';
import assert from 'node:assert/strict';
import {readFileSync, mkdtempSync, rmSync} from 'node:fs';
import {tmpdir} from 'node:os';
import {join} from 'node:path';
import {spawnSync} from 'node:child_process';
// Execute the actual preparation shell, so tests cannot drift from workflow behavior.
const workflow = readFileSync(new URL('../../../../.github/workflows/publish-preview-plugin.yml', import.meta.url), 'utf8');
const script = workflow.split('        run: |\n')[1].split('\n  publish:')[0]
    .split('\n').map(line => line.startsWith('          ') ? line.slice(10) : line).join('\n');
const prepare = (patch = {}) => {
    const directory = mkdtempSync(join(tmpdir(), 'core-workflow-'));
    const output = join(directory, 'output');
    try {
        const result = spawnSync('bash', ['-e', '-c', script], {encoding: 'utf8', env: {...process.env,
            EVENT:'push', GITHUB_SHA:'a'.repeat(40), GITHUB_OUTPUT:output, CORE_RELEASE_CLI:'cli-v1.2.3',
            DEV_ENABLED:'true', PROM_ENABLED:'true', INPUT_TARGET:'', INPUT_REF:'', INPUT_APPLY:'',
            INPUT_CHANNEL:'', INPUT_CORE_VERSION:'', DISPATCH_TAG:'', ...patch}});
        return {...result, values: result.status === 0 ? Object.fromEntries(readFileSync(output,'utf8').trim().split('\n').map(line => line.split('='))) : {}};
    } finally {rmSync(directory,{recursive:true,force:true});}
};
test('push uses dev and actual checkout; no compatible CLI disables every publication', () => {
    assert.deepEqual(prepare().values, {target:'dev',ref:'a'.repeat(40),apply:'true',enabled:'true',channel:'dev',core_version:''});
    assert.equal(prepare({CORE_RELEASE_CLI:''}).values.enabled, 'false');
    assert.equal(prepare({DEV_ENABLED:''}).values.enabled, 'false');
});
test('dispatch uses stable tag, independently of backend target', () => {
    const result = prepare({EVENT:'repository_dispatch',DISPATCH_TAG:'release-11-11-2026'});
    assert.equal(result.status, 0, result.stderr);
    assert.equal(result.values.ref, 'refs/tags/release-11-11-2026');
    assert.equal(result.values.channel, 'stable');
    assert.notEqual(prepare({EVENT:'repository_dispatch'}).status, 0);
});
test('manual channel is explicit and stable requires version plus confirmed tag', () => {
    const manual = {EVENT:'workflow_dispatch',INPUT_TARGET:'dev',INPUT_APPLY:'false',INPUT_CHANNEL:'stable',
        INPUT_REF:'refs/tags/release-11-11-2026',INPUT_CORE_VERSION:'0.56.0'};
    assert.equal(prepare(manual).values.channel, 'stable');
    assert.equal(prepare({...manual,INPUT_CHANNEL:'dev',INPUT_REF:'develop'}).values.channel, 'dev');
    for (const patch of [{INPUT_CORE_VERSION:''},{INPUT_REF:'develop'},{INPUT_CHANNEL:''}]) {
        assert.notEqual(prepare({...manual,...patch}).status,0);
    }
});
