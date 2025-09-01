self.addEventListener('install', event => {
    event.waitUntil(
        caches.open('igk-cache-v1').then(cache => {
            return cache.addAll([
                '/',
                '/css/tabs.css',
                '/images/Logo1.png'
            ]);
        })
    );
});

self.addEventListener('fetch', event => {
    event.respondWith(
        caches.match(event.request).then(response => {
            return response || fetch(event.request);
        })
    );
});