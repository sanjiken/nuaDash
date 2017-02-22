function FirstCtrl(helloBean, $scope ){
	
	var vm = this;
	vm.helloBean = helloBean;
	
	$scope.addUserCtrlJs = function(data){
		
		vm.helloBean.addUserBean(data).then(function(msgUserAdd){
			console.log("this is the response for adding user : " + msgUserAdd);
		});
	}
	
	
	$scope.searchUserJs = function(data){
		vm.helloBean.searchUserBean(data).then(function(userResult){
			$scope.findUser = userResult;
		})
	}

}