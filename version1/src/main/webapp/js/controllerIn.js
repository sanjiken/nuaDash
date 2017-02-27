function CtrlSignIn(beanSignIn,$scope)
{
var vm=this;
vm.beanSignIn=beanSignIn;
$scope.searchUserJs=function(data){
	
	vm.beanSignIn.searchUserBean(data).then(function(userResult){
		
		$scope.findUser=userResult;
		
		});
	
}
	
	

}