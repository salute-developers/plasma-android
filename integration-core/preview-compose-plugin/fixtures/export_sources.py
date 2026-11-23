#!/usr/bin/env python3
"""Export current clean fixture commits as portable bundles, archives and patches."""
import argparse
import hashlib
import json
from pathlib import Path
import subprocess


def git(root, *args):
    return subprocess.check_output(['git', *args], cwd=root, text=True).strip()


def digest(path):
    return hashlib.sha256(path.read_bytes()).hexdigest()


def export(root):
    receipt = json.loads((root / 'sources.json').read_text())
    for name in ['A', 'B', 'B2']:
        checkout = root / name
        assert not git(checkout, 'status', '--porcelain'), f'{name} has uncommitted sources'
        entry = receipt['fixtures'][name]
        assert entry['commit'] == git(checkout, 'rev-parse', 'HEAD')
        source_tar = root / (name + '-source.tar')
        with source_tar.open('wb') as stream:
            subprocess.run(['git', 'archive', 'HEAD'], cwd=checkout, stdout=stream, check=True)
        entry['sourceArchiveSha256'] = digest(source_tar)
        bundle = root / (name + '.bundle')
        git(checkout, 'bundle', 'create', str(bundle), '--all')
        entry['bundleSha256'] = digest(bundle)
        if name != 'A':
            parent = 'A' if name == 'B' else 'B'
            subprocess.run(['git', 'fetch', '--no-tags', str(root / parent), 'HEAD'], cwd=checkout, check=True, stdout=subprocess.DEVNULL)
            patch = root / (name + '.patch')
            patch.write_text(git(checkout, 'diff', '--binary', 'FETCH_HEAD', 'HEAD') + '\n')
            entry['patchSha256'] = digest(patch)
    # Actual reviewed producer sources carried by A, including later fixes.
    receipt['overlay'] = [{'path': str(p.relative_to(root / 'A')), 'sha256': digest(p)}
                          for p in sorted((root / 'A/integration-core/preview-compose-plugin').rglob('*'))
                          if p.is_file() and not any(part in {'build', '.gradle', 'node_modules', '__pycache__'}
                                                     for part in p.relative_to(root / 'A').parts)]
    (root / 'sources.json').write_text(json.dumps(receipt, indent=2) + '\n')


if __name__ == '__main__':
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument('root', type=Path)
    export(parser.parse_args().root.resolve())
