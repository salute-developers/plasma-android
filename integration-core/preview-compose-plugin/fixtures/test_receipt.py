import copy
import unittest
from receipt import verify_component_b, component_index


class ReceiptMetadataTest(unittest.TestCase):
    def setUp(self):
        self.a = {'componentName': 'TextField', 'resolvedTypes': ['Color'], 'params': [
            {'id': 'cursorColor', 'type': 'color'},
            {'id': 'cursorColorReadOnly', 'type': 'color', 'deprecated': {'message': 'Use cursorColor'}},
            {'id': 'padding', 'type': 'dimension'},
        ]}
        self.b = copy.deepcopy(self.a)
        self.b['params'].pop(1)

    def test_exact_deprecated_removal_is_accepted(self):
        verify_component_b(self.a, self.b)

    def test_unrelated_changes_and_unconfirmed_removal_are_rejected(self):
        for mutation in ['current', 'other', 'types', 'deprecated']:
            a, b = copy.deepcopy(self.a), copy.deepcopy(self.b)
            if mutation == 'current':
                b['params'].pop(0)
            elif mutation == 'other':
                b['params'][-1]['type'] = 'float'
            elif mutation == 'types':
                b['resolvedTypes'].append('Brush')
            else:
                a['params'][1].pop('deprecated')
            with self.subTest(mutation=mutation), self.assertRaises(AssertionError):
                verify_component_b(a, b)

    def test_duplicate_component_records_cannot_disappear_in_the_index(self):
        with self.assertRaisesRegex(AssertionError, 'Duplicate componentName'):
            component_index([self.a, copy.deepcopy(self.a)])



if __name__ == '__main__':
    unittest.main()
