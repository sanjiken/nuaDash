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
	}}
	
	$scope.addUserCtrlJs = function(data){
		
{	
	if (data.userName == null || data.userName== undefined || data.userName  == "" ) {
			$scope.response == "userName invalid !!!"
	    }
	else if (data.email == null || data.email == undefined || data.email  == "" ) {
	
		$scope.response == "mail invalid !!!"
		}
	else	if (data.password == null || data.password == undefined || data.password  == "" ) {
		$scope.response == "password invalid !!!"
		}
	else if (data.confPassword == null || data.confPassword == undefined || data.confPassword  == "" ) {
		$scope.response == "confPassword invalide !!!"
	}
	
	else if (data.confPassword != data.password) {
		$scope.response == "confirmer votre password !!!"
	} 
else 
	 {
		
		
			vm.angularbeanUser.addUserBean(data).then(function(msgUserAdd){
				("this is the response for adding user : " + msgUserAdd);
				$scope.response=msgUserAdd;
			});
			
	
	 }
}
	
}
	


