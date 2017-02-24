function FirstCtrl(helloBean, $scope,$window ){



	var vm = this;
	vm.helloBean = helloBean;
	
	    $scope.searchUserJs = function(data){
			vm.helloBean.searchUserBean(data).then(function(userResult){
				$scope.findUser = userResult;
				if (userResult == null || userResult == "null" || userResult == "" ) {
					
					
					
				}else{
					$window.location.href = 'bonjour.html';
				}
			});
	}


}