const Foo = {
    props: ['id'],
    template: '<div>foo{{id}}</div>'
};

const Sidebar = {
    props: ['id'],
    template: '<div>sidebar{{id}}</div>'
};

const router_foo = {
    name: 'foo',
    path: '/foo/:id',
    components: {main: Foo, sidebar: Sidebar},
    props: {main: true, sidebar: true}
};

const router_bar = {
    path: '/bar',
    redirect: '/foo/222'
};

const routers = [
    router_foo, router_bar
];

const router = new VueRouter({
    mode: 'history',
    routes: routers
});

new Vue({
    router: router,
    el: '#app_router'
});

