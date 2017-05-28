myApp.controller('LoginController', function ($scope, $route,$location) { 
    debugger;
    $scope.$route = $route;

    $scope.$login = {
        person:{
            name:"zls",
            password:"123"
        }
    };
    // 登录者信息

    $scope.$login.loginBtn = function(){
        debugger;
        if($scope.$login.person.name == 'zls' && $scope.$login.person.password == '123'){
            $scope.$login.msg = '登录成功！';
            $location.path("/main");
        }else{
            $scope.$login.msg = '登录失败！';
        }
    }



});