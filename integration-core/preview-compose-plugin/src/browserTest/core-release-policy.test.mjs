import {test} from 'node:test';
import assert from 'node:assert/strict';
import {resolveCoreRelease} from './core-release-policy.mjs';
const sha = 'a'.repeat(40);
const input = {baseVersion: '1.2.3', commit: sha, actualCommit: sha};
test('build coordinates and ID do not depend on publication channel or local Git status', () => {
    const core = resolveCoreRelease(input);
    assert.equal(core.version, `1.2.3-dev.${sha}`);
    assert.equal('channel' in core, false);
    assert.deepEqual(resolveCoreRelease({...input, channel:'dev', dirty:true}), core);
    assert.deepEqual(resolveCoreRelease({...input, channel:'stable', dirty:false}), core);
});
test('explicit new Core version gets a different repeatable build ID without a commit', () => {
    const first=resolveCoreRelease({...input,version:'1.2.3-dev.1'});
    const second=resolveCoreRelease({...input,version:'1.2.3-dev.2'});
    assert.notEqual(first.buildId,second.buildId);
    assert.deepEqual(resolveCoreRelease({...input,version:'1.2.3-dev.2'}),second);
});
test('stable version can be built without selecting any upload channel', () => {
    assert.equal(resolveCoreRelease({...input,version:'1.2.3'}).version,'1.2.3');
    for(const patch of [{actualCommit:'b'.repeat(40)},{version:'latest'},{baseVersion:'bad'}])
        assert.throws(()=>resolveCoreRelease({...input,...patch}));
});
