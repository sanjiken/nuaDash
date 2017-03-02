function CtrlAccueil (angularbeanUser, $scope) {
	
	var vm = this;
	vm.angularbeanUser = angularbeanUser;
	
	$scope.searchUserJs=function(data){
		
		if (data.email == null || data.email == undefined || data.email  == "" ) {
			$scope.resUserSearsh == "mail invalid !!!";
		}else if(data.password == null || data.password == undefined || data.password  == ""){
			$scope.resUserSearsh == "password null !!!";
		}else{
			vm.angularbeanUser.userSearsh(data).then(function(resUserSearsh){
				$scope.resUserSearsh = resUserSearsh;
				
				if ($scope.resUserSearsh == "succes") {
					
					//get user information
					vm.angularbeanUser.getUserConnected(data).then(function(userConnected){
						
						$scope.findUser=userConnected;
						console.log("resultat search" + vm.angularbeanUser.resUserSearsh)
						
						});
					
				}
				
				
				
			})
		
		
	}
			
	$scope.addUserCtrlJs = function(data){
		
			vm.angularbeanUser.addUserBean(data).then(function(msgUserAdd){
				("this is the response for adding user : " + msgUserAdd);
			
			});
			
		}
	
	

	


}