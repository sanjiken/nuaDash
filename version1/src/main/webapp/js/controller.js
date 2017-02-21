function FirstCtrl(helloBean, $scope ){
	
	var vm = this;
	vm.helloBean = helloBean;
	
	$scope.addUserCtrlJs = function(data){
		
		vm.helloBean.addUserBean(data).then(function(msgUserAdd){
			console.log("this is the response for adding user : " + msgUserAdd);
		});
	}
	
	vm.helloBean.amal = "coucou";
	vm.helloBean.roua = "rouaCommit";
}