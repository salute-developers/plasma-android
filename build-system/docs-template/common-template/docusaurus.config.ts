import { themes as prismThemes } from 'prism-react-renderer';
import type { Config } from '@docusaurus/types';
import type * as Preset from '@docusaurus/preset-classic';

// This runs in Node.js - Don't use client-side code here (browser APIs, JSX...)
const versionsArchived = require('./versionsArchived.json');

const config: Config = {
  title: '{{ docs-theme-name }}',
  tagline: 'Дизайн-система для разработки современных приложений.',
  favicon: 'img/favicon.png',

  // Future flags, see https://docusaurus.io/docs/api/docusaurus-config#future
  future: {
    v4: true, // Improve compatibility with the upcoming Docusaurus v4
  },

  // Set the production url of your site here
  url: '{{ docs-url }}',
  // Set the /<baseUrl>/ pathname under which your site is served
  // For GitHub pages deployment, it is often '/<projectName>/'
  baseUrl: '{{ docs-baseUrl }}',

  // GitHub pages deployment config.
  // If you aren't using GitHub pages, you don't need these.
  organizationName: 'salute-developers', // Usually your GitHub org/user name.
  projectName: 'Plasma Android', // Usually your repo name.

  onBrokenLinks: 'warn',
  onBrokenMarkdownLinks: 'warn',

  // Even if you don't use internationalization, you can use this field to set
  // useful metadata like html lang. For example, if your site is Chinese, you
  // may want to replace "en" with "zh-Hans".
  i18n: {
    defaultLocale: 'ru',
    locales: ['ru'],
  },

  presets: [
    [
      'classic',
      {
        docs: {
          routeBasePath: '/',
          sidebarPath: require.resolve('./sidebars.js'),
          includeCurrentVersion: true,
          versions: {
            current: {
              label: '{{ docs-artifactVersion }}',
              path: '',
            },
          },
        },
        theme: {
          customCss: './src/css/custom.css',
        },
      } satisfies Preset.Options,
    ],
  ],

  themeConfig: {
    navbar: {
      title: '{{ docs-theme-name }}',
      items: [
        {
          href: 'https://github.com/salute-developers/plasma-android',
          label: 'GitHub',
          position: 'right',
        },
        {
          href: '{{ docs-api-href }}',
          label: 'API Docs',
          position: 'right',
        },
        {
          type: 'docsVersionDropdown',
          position: 'left',
          dropdownActiveClassDisabled: true,
          dropdownItemsAfter: [
              ...Object.entries(versionsArchived)
                  .filter(([versionName]) => versionName !== '{{ docs-artifactVersion }}')
                  .reverse()
                  .map(([versionName, versionUrl]) => ({
                      label: versionName,
                      href: versionUrl,
                  })),
          ],
        },
      ]
    },
    footer: {
      style: 'light',
      links: [
        {
          title: 'Сообщество',
          items: [
            {
              label: 'GitHub',
              href: 'https://github.com/salute-developers/plasma-android',
            },
          ],
        },
      ],
    },
    prism: {
      theme: prismThemes.github,
      darkTheme: prismThemes.dracula,
    },
  } satisfies Preset.ThemeConfig,
};

export default config;
