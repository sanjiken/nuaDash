function FirstCtrl(helloBean, $scope ){

var vm = this;
vm.helloBean = helloBean;

    $scope.searchUserJs = function(data){
   	console.log("this is the mail : " + data.mail)
   	console.log("this is the mail : " + data.password)
vm.helloBean.searchUserBean(data).then(function(userResult){
$scope.findUser = userResult;
if ($scope.findUser != null) {
console.log("redirection vers bonjour.html");
}else{
console.log("user not found !!! ");
}
})
}


}