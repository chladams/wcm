angular.module('wcmApp', []).controller('userCtrl', function($scope ,$http) {
    toastr.options = {
        closeButton: false,
        debug: false,
        progressBar: false,
        positionClass: "toast-top-center",
        onclick: null,
        showDuration: "300",
        hideDuration: "1000",
        timeOut: "5000",
        extendedTimeOut: "1000",
        showEasing: "swing",
        hideEasing: "linear",
        showMethod: "fadeIn",
        hideMethod: "fadeOut"
    };
    $scope.fName = '';
    $scope.lName = '';
    $scope.passw1 = '';
    $scope.passw2 = '';
    $http({
        method: 'GET',
        url: 'http://localhost:8009/user/list'
    }).then(function successCallback(response) {
        console.log(response.data.list);
        $scope.users=angular.fromJson(response.data.list);
    }, function errorCallback(response) {
        console.log('失败');
    });

    $scope.edit = true;
    $scope.error = false;
    $scope.incomplete = false;

    $scope.editUser = function(id) {
        if (id == 'new') {
            var id1 = $scope.id;
            var name = $scope.username;
            var state = $scope.state;
            $http({
            method:'post',
                url:'http://localhost:8009/user/add',
                data:{username:name,id:id1,state:state},
            headers:{'Content-Type': 'application/x-www-form-urlencoded'},
            transformRequest: function(obj) {
                var str = [];
                for(var p in obj){
                    str.push(encodeURIComponent(p) + "=" + encodeURIComponent(obj[p]));
                }
                return str.join("&");
            }
        }).then(function successCallback(response) {
            toastr.info(response.data.fs);
            console.log(response.toString());
            console.log(response.data.fs);
        }, function errorCallback(response) {
            toastr.error(response.data.fs);
            console.log(response.toString());
            console.log(response.data.fs);
            $scope.error=true;
        });


            $scope.edit = true;
            $scope.incomplete = true;
            $scope.fName = '';
            $scope.lName = '';
        } else {
            $http({
                method: 'GET',
                url: 'http://localhost:8009/user/get',
                params:{id:id}
            }).then(function successCallback(response) {
                console.log(response.data);
                $scope.edit = false;
                $scope.fName = response.data.username;
                $scope.lName = response.data.state;
            }, function errorCallback(response) {
                console.log('失败');
            });


        }
    };

    $scope.$watch('passw1',function() {$scope.test();});
    $scope.$watch('passw2',function() {$scope.test();});
    $scope.$watch('fName', function() {$scope.test();});
    $scope.$watch('lName', function() {$scope.test();});

    $scope.test = function() {
        if ($scope.passw1 !== $scope.passw2) {
            $scope.error = true;
        } else {
            $scope.error = false;
        }
        $scope.incomplete = false;
        if ($scope.edit && (!$scope.fName.length ||
                !$scope.lName.length ||
                !$scope.passw1.length || !$scope.passw2.length)) {
            $scope.incomplete = true;
        }
    };

});