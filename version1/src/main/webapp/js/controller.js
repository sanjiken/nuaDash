function FirstCtrl(helloBean, $scope ){
	
	var vm = this;
	vm.helloBean = helloBean;
	
	$scope.addUser = function(data){
		
		vm.helloBean.addUser(data).then(function(msgUserAdd){
			console.log("this is the response for adding user : " + msgUserAdd);
		});
	}
	
	
}