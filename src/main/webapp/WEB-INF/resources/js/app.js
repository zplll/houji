/**
 * Created by zipon on 2017/3/8.
 */
var app = angular.module("myapp",[]);


app.controller('login', function($scope,$http){

    $scope.formData={};
    $scope.buttonAbled=false;
    $scope.message = null;
    //提交表单
    $scope.processForm = function() {
        console.log($scope.formData);
        $http({
            method  : 'POST',
            url     : '/login',
            data    : $.param($scope.formData),  // pass in data as strings
            headers : { 'Content-Type': 'application/x-www-form-urlencoded' }  // set the headers so angular passing info as form data (not request payload)
        })
            .success(function(data) {
                    console.log(data);

                    console.log($scope.formData);
                    $scope.message = data.message;
                    console.log($scope.message);
                //如果登陆成功就跳转到首页
                if(data.code=="0"){
                    window.location="index.jsp";
                }
                }
            );
    };
})


app.controller('selecttask',function ($scope,$http) {
    $scope.tasks= null;
    $scope.columns = null;
    $http({
        method  : 'POST',
        url     : '/task/selectbyleader',
        data    : '',  // pass in data as strings
        headers : { 'Content-Type': 'application/x-www-form-urlencoded' }
    })
        .success(function(data){
            $scope.columns = data.columns;
            $scope.tasks = data.details;
            console.log($scope.tasks);
        });
})