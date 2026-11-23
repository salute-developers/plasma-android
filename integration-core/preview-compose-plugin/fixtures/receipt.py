#!/usr/bin/env python3
"""Verify real fixture ZIPs and save an auditable receipt outside Git."""
import argparse
import copy
import hashlib
import json
from pathlib import Path
import subprocess
import zipfile


def sha(data):
    return hashlib.sha256(data).hexdigest()


def diff(a, b, path=''):
    if isinstance(a, dict) and isinstance(b, dict):
        return [item for key in sorted(a.keys() | b.keys()) for item in
                ([{'path': path + '/' + key, 'before': a.get(key), 'after': b.get(key)}] if key not in a or key not in b else diff(a[key], b[key], path + '/' + key))]
    if a != b:
        return [{'path': path, 'before': a, 'after': b}]
    return []


def expected_component_b(component):
    """B removes exactly the deprecated old color overload, retaining all other fields."""
    expected = copy.deepcopy(component)
    removed = [p for p in expected['params'] if p.get('id') == 'cursorColorReadOnly']
    assert removed and all(p.get('deprecated', {}).get('message') == 'Use cursorColor' for p in removed)
    assert any(p.get('id') == 'cursorColor' for p in expected['params'])
    expected['params'] = [p for p in expected['params'] if p.get('id') != 'cursorColorReadOnly']
    return expected


def verify_component_b(a, b):
    expected = expected_component_b(a)
    assert b == expected, diff(expected, b)


def component_index(entries):
    indexed = {item['componentName']: item for item in entries}
    assert len(indexed) == len(entries), 'Duplicate componentName in fixture metadata'
    return indexed


def verify(root):
    receipt = json.loads((root / 'sources.json').read_text())
    metadata = {}
    for name in ['A', 'B', 'B2']:
        entry = receipt['fixtures'][name]
        checkout = root / name
        artifact = checkout / 'integration-core/preview-compose-plugin/build/distributions/preview-compose-plugin.zip'
        with zipfile.ZipFile(artifact) as archive:
            manifest = json.loads(archive.read('preview-plugin.json'))
            meta = archive.read('api-meta.json')
            assert any(path.endswith('.wasm') for path in archive.namelist()), 'Real Wasm output required'
        # Канал хранится в рецепте загрузки, не в ZIP.
        assert manifest['commit'] == entry['commit']
        assert manifest['coreRelease'] == {'libraryId': 'uikit-compose', 'platform': 'compose', 'version': manifest['uikitComposeVersion']}
        assert manifest['apiMetaSha256'] == sha(meta)
        # Exact resource bytes that generated the factories, not just parsed JSON equality.
        resource = checkout / 'integration-core/preview-compose-plugin/build/generated/preview-api-meta/api-meta.json'
        assert resource.read_bytes() == meta
        entry.update({'archive': str(artifact), 'zipSha256': sha(artifact.read_bytes()), 'metaSha256': sha(meta), 'manifest': manifest})
        metadata[name] = meta
    assert metadata['A'] != metadata['B']
    assert metadata['B'] == metadata['B2'], 'B2 must keep exact B meta bytes'
    a, b = [json.loads(metadata[name]) for name in ['A', 'B']]
    a_by_name, b_by_name = [component_index(entries) for entries in [a, b]]
    assert set(b_by_name) - set(a_by_name) == {'CoreChannelProbe'}
    assert not (set(a_by_name) - set(b_by_name))
    changes = {name: diff(a_by_name[name], b_by_name[name]) for name in a_by_name if a_by_name[name] != b_by_name[name]}
    assert set(changes) == {'TextField', 'TextArea'}, changes.keys()
    # Removing @ApiDeprecated suppresses only the old API method from generated meta.
    for name in ['TextField', 'TextArea']:
        verify_component_b(a_by_name[name], b_by_name[name])
    assert 'CoreChannelProbe' in receipt['fixtures']['B']['manifest']['components']
    assert 'CoreChannelProbe' not in receipt['fixtures']['A']['manifest']['components']
    assert receipt['fixtures']['B']['manifest']['coreRelease'] == receipt['fixtures']['B2']['manifest']['coreRelease']
    assert receipt['fixtures']['B']['zipSha256'] != receipt['fixtures']['B2']['zipSha256']
    receipt['metaDiff'] = changes
    receipt['tools'] = {name: subprocess.check_output(command, text=True, stderr=subprocess.STDOUT).strip()
                        for name, command in {'python': ['python3', '--version'], 'node': ['node', '--version'], 'git': ['git', '--version']}.items()}
    (root / 'receipt.json').write_text(json.dumps(receipt, indent=2) + '\n')
    print(root / 'receipt.json')


if __name__ == '__main__':
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument('root', type=Path)
    verify(parser.parse_args().root.resolve())
