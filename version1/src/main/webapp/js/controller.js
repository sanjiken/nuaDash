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
								
								});
							
						}
						
						
						
					})
	}
	

}
	$scope.addUserCtrlJs = function(data){

	
	
		
		
		console.log("00000")
	    if(data.userName == null || data.userName == undefined || data.userName  == ""){
			$scope.response = "Vous n'avez spécifiez votre user name "
		}else if(data.password == null || data.password == undefined || data.password  == ""){
			$scope.response = "Vous n'avez spécifiez votre password "
		}else if(data.confPassword == null || data.confPassword == undefined || data.confPassword  == ""){
			$scope.response = "Vous n'avez spécifiez votre confirmation  password "
		}else if(data.email == null || data.email == undefined || data.email  == ""){
            $scope.response = "Vous n'avez spécifiez votre email"
		}else {
			vm.angularbeanUser.mailSearsh(data.email).then(function(rescherchmail){
				$scope.rescherchmail = rescherchmail;
				
				if($scope.rescherchmail == "mailNotFound" ){
					
				     vm.angularbeanUser.addUserBean(data).then(function(msgUserAdd){
						("this is the response for adding user : " + msgUserAdd);
						$scope.response=msgUserAdd;
				 });

				}else{
					$scope.response = "Vous avez spécifiez un email exist déja"
				}
				
		})
			}


		}
		

}


