function SecondCtrl(helloBean, $scope ){
	
	var vn = this;
	vn.helloBean = helloBean;
	
$scope.addUserCtrlJs = function(data){
		
		vn.helloBean.addUserBean(data).then(function(msgUserAdd){
			("this is the response for adding user : " + msgUserAdd);
		});
	}
	
	$scope.searchUserJs = function(data){
		vm.helloBean.searchUserBean(data).then(function(userResult){
			$scope.findUser = userResult;
		})
	}


}
