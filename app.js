var myApp = angular.module('myApp', ['ui.router', 'ngRoute']);


myApp.config(['$stateProvider', '$urlRouterProvider',
    function($stateProvider, $urlRouterProvider) {
        $urlRouterProvider.when("/").otherwise("/login");
        $stateProvider.state("login", {
            url: "/login",
            templateUrl: '/angular_route/login/login.html',
            controller: 'LoginController'
        }).state("main", {
            url: "/main",
            templateUrl: '/angular_route/main/main.html',
            controller: 'MainController'
        }).state("main.systemSetting", {
            url: "/systemSetting",
            views: {
                'mainDiv': {
                    template: '<H1>系统管理</H1>',
                    controller: "SystemSettingController"
                }
            }
        }).state("main.userManage", {
            url: "/userManage",
            views: {
                'mainDiv': {
                    template: '<H1>用户管理</H1>',
                    controller: "MainController"
                }
            }
        }).state("main.menuManage", {
            url: "/menuManage",
            views: {
                'mainDiv': {
                    template: '<H1>菜单管理</H1>',
                    controller: "MainController"
                }
            }
        }).state("main.roleManage", {
            url: "/roleManage",
            views: {
                'mainDiv': {
                    template: '<H1>角色管理</H1>',
                    controller: "MainController"
                }
            }
        });

        $urlRouterProvider.otherwise("/login");
    }
]);
