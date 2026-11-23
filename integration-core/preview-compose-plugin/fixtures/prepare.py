#!/usr/bin/env python3
"""Prepare portable, isolated fixture sources; never changes a product branch.

Preparation writes files only. `--record-fixture-commits` is explicit because
real producer builds require clean, attributable source commits. These commits
are confined to throwaway repositories and are never pushed.
"""
import argparse
import hashlib
import json
from pathlib import Path
import shutil
import subprocess
import tarfile


def run(root, *args):
    return subprocess.check_output(args, cwd=root, text=True).strip()


def digest(path):
    return hashlib.sha256(path.read_bytes()).hexdigest()


def prepare(source, output, ref, record):
    if output.exists():
        raise ValueError('Destination must not exist; existing fixtures are never overwritten')
    stable = run(source, 'git', 'rev-parse', ref + '^{commit}')
    output.mkdir(parents=True)
    archive = output / 'stable-source.tar'
    with archive.open('wb') as stream:
        subprocess.run(['git', 'archive', stable], cwd=source, stdout=stream, check=True)
    base = output / 'A'
    base.mkdir()
    with tarfile.open(archive) as source_tar:
        source_tar.extractall(base, filter='data')
    # Producer changes may be uncommitted: export exactly these reviewed paths,
    # keeping sdds-core identical to the confirmed stable tag for A.
    paths = [
        'integration-core/preview-compose-plugin', 'integration-core/preview-sdk-compose',
        'integration-core/uikit-compose-fixtures/src/commonMain/kotlin/com/sdds/compose/uikit/fixtures/stories/button/ButtonGroupStory.kt',
        '.github/workflows/publish-preview-plugin.yml',
    ]
    overlay = []
    for relative in paths:
        original = source / relative
        if original.is_dir() and (base / relative).exists():
            shutil.rmtree(base / relative)
        files = [original] if original.is_file() else [p for p in original.rglob('*') if p.is_file()]
        for path in files:
            rel = path.relative_to(source)
            if any(part in {'build', '.gradle', 'node_modules', '.kotlin', '__pycache__'} for part in rel.parts):
                continue
            target = base / rel
            target.parent.mkdir(parents=True, exist_ok=True)
            shutil.copy2(path, target)
            overlay.append({'path': str(rel), 'sha256': digest(path)})
    for name in ['B', 'B2']:
        shutil.copytree(base, output / name)
    uikit = Path('sdds-core/uikit-compose/src/commonMain/kotlin/com/sdds/compose/uikit')
    story = Path('integration-core/uikit-compose-fixtures/src/commonMain/kotlin/com/sdds/compose/uikit/fixtures/stories/button')
    for name in ['B', 'B2']:
        root = output / name
        text_field = root / uikit / 'TextFieldStyleBuilder.kt'
        text = text_field.read_text()
        marker = '    @ApiDeprecated("Use cursorColor")\n'
        if text.count(marker) != 1:
            raise ValueError('Expected exactly one cursorColorReadOnly ApiDeprecated annotation')
        text_field.write_text(text.replace(marker, ''))
        builder = (root / uikit / 'BasicButtonStyleBuilder.kt').read_text()
        builder = builder.replace('BasicButton', 'CoreChannelProbe').replace('basicButtonBuilder', 'coreChannelProbeBuilder')
        builder = builder.replace('LocalButtonStyle', 'LocalCoreChannelProbeStyle')
        (root / uikit / 'CoreChannelProbeStyleBuilder.kt').write_text(builder)
        button_story = (root / story / 'ButtonStory.kt').read_text()
        imports = button_story.split('@StoryUiState')[0]
        probe = button_story[button_story.index('@Story(componentId = "BasicButton")'):]
        probe = probe.replace('BasicButtonStory', 'CoreChannelProbeStory').replace('componentId = "BasicButton"', 'componentId = "CoreChannelProbe"')
        probe = probe.replace('ComponentKey.BasicButton,', 'ComponentKey("CoreChannelProbe", ComponentKey.BasicButton.group),')
        probe = probe.replace('label = state.label', 'label = \"Core probe \" + state.label')
        (root / story / 'CoreChannelProbeStory.kt').write_text(imports + probe)
        test = root / 'integration-core/preview-compose-plugin/src/commonTest/kotlin/com/sdds/preview/compose/plugin/StoryRegistryEntriesTest.kt'
        test.write_text(test.read_text().replace('assertEquals(79, StoryRegistry.previewEntries().size)', 'assertEquals(80, StoryRegistry.previewEntries().size)'))
    # B2 changes the actual renderer source, without changing any Core/meta source.
    signature = output / 'B2' / story / 'CoreChannelProbeStory.kt'
    signature.write_text(signature.read_text().replace('label = "Label"', 'label = "Core B2 preview"').replace('Core probe ', 'Core B2 '))
    receipt = {'stableRef': ref, 'stableCommit': stable, 'sourceRepositoryHead': run(source, 'git', 'rev-parse', 'HEAD'),
               'overlay': sorted(overlay, key=lambda item: item['path']), 'fixtures': {}, 'recorded': record}
    for name in ['A', 'B', 'B2']:
        root = output / name
        # A portable source tar is always available, including when commits are forbidden.
        tar_path = output / (name + '-source.tar')
        with tarfile.open(tar_path, 'w') as target:
            target.add(root, arcname='.')
        entry = {'sourceArchiveSha256': digest(tar_path), 'channel': 'stable' if name == 'A' else 'dev'}
        if record:
            run(root, 'git', 'init', '-q')
            run(root, 'git', 'config', 'user.name', 'Local Core fixture')
            run(root, 'git', 'config', 'user.email', 'fixture@localhost')
            run(root, 'git', 'add', '.')
            run(root, 'git', 'commit', '-qm', 'Local isolated Core fixture ' + name)
            entry['commit'] = run(root, 'git', 'rev-parse', 'HEAD')
            entry['coreTree'] = run(root, 'git', 'rev-parse', 'HEAD:sdds-core')
            if name == 'A':
                # Stable tree proof is obtained from the original repository, never fabricated.
                subprocess.run(['git', 'fetch', '--no-tags', str(source), ref], cwd=root, check=True, stdout=subprocess.DEVNULL)
                run(root, 'git', 'tag', ref.removeprefix('refs/tags/'), 'FETCH_HEAD')
        receipt['fixtures'][name] = entry
    if record:
        for name, parent in [('B', 'A'), ('B2', 'B')]:
            root = output / name
            subprocess.run(['git', 'fetch', '--no-tags', str(output / parent), 'HEAD'], cwd=root, check=True, stdout=subprocess.DEVNULL)
            patch = output / (name + '.patch')
            patch.write_text(run(root, 'git', 'diff', '--binary', 'FETCH_HEAD', 'HEAD') + '\n')
            receipt['fixtures'][name]['patchSha256'] = digest(patch)
        for name in ['A', 'B', 'B2']:
            bundle = output / (name + '.bundle')
            run(output / name, 'git', 'bundle', 'create', str(bundle), '--all')
            receipt['fixtures'][name]['bundleSha256'] = digest(bundle)
    (output / 'sources.json').write_text(json.dumps(receipt, indent=2) + '\n')
    return receipt


if __name__ == '__main__':
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument('--source', type=Path, default=Path(__file__).resolve().parents[3])
    parser.add_argument('--output', required=True, type=Path)
    parser.add_argument('--stable-ref', default='refs/tags/release-11-11-2026')
    parser.add_argument('--record-fixture-commits', action='store_true')
    args = parser.parse_args()
    prepare(args.source.resolve(), args.output.resolve(), args.stable_ref, args.record_fixture_commits)
