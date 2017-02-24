function FirstCtrl(helloBean, $scope ,$window){
	
	var vm = this;
	vm.helloBean = helloBean;
	
     $scope.searchUserJs = function(data){
    	 console.log("this is the mail : " + data.mail)
    	 console.log("this is the mail : " + data.password)
		vm.helloBean.searchUserBean(data).then(function(userResult){
			$scope.findUser = userResult;
			 console.log
			if ($scope.findUser != null) {
				var myWindow1 = $window.location.href("bonjour.html");}
			else
				{var myWindow2 = $window.open("index2.html");	
			}
		})
	}


}
