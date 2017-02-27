function CtrlSignUp(beanSignUp,$scope){
	var vn = this;
	vn.beanSignUp = beanSignUp;
	
$scope.addUserCtrlJs = function(data){
		
		vn.beanSignUp.addUserBean(data).then(function(msgUserAdd){
			("this is the response for adding user : " + msgUserAdd);
		});
	}
	
	
}