function FirstCtrl(helloBean, $scope ){
	
	var vm = this;
	vm.helloBean = helloBean;
	
     $scope.searchUserJs = function(data){
		vm.helloBean.searchUserBean(data).then(function(userResult){
			$scope.findUser = userResult;
			if ($scope.findUser != null) {
				console.log("redirection vers bonjour.html");
			}else{
				console.log("user not found !!! ");
			}
		})
	}


}
