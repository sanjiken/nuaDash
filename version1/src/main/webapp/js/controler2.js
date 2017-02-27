function SecondCtrl(helloBean, $scope ){
	
	var vn = this;
	vn.helloBean = helloBean;
	
$scope.addUserCtrlJs = function(data){
		
		vn.helloBean.addUserBean(data).then(function(msgUserAdd){
			("this is the response for adding user : " + msgUserAdd);
		});
	}
	
	


}
