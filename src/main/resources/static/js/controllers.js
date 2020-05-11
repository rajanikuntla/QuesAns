app.controller('addQuestionController', function($http, $scope){
	$scope.init = function(){
		$scope.msg ="";
		$scope.ques={};
	};
	
	
	$scope.save = function() {
		var ques = $scope.ques;
		$http({
			method: 'POST',
		    url: '/addQuestion',
		    data: ques,
		    headers: {
		        "Content-Type": "application/json"
		    }
		}).then(function(response) {
			if(response.status == 202){
				$scope.msg ="added successfully";
			}
		});

	}
	
	$scope.next = function(){
	       window.location = "#/getQuestion";
	 }
	
	$scope.init();

});




app.controller('getQuestionController', function($http, $scope){
	
	$scope.init = function(){
		$scope.ques ={};
		$http.get('/getQuestion').then(function (response) { 
			$scope.ques.question = response.data.question;
			
		});
	};
	
	$scope.save = function() {
		var ques = $scope.ques;
		$http({
			method: 'POST',
		    url: '/addQuestion',
		    data: ques,
		    headers: {
		        "Content-Type": "application/json"
		    }
		}).then(function(response) {
			if(response.status == 202){
				$scope.msg ="added successfully";
			}
		});
	}
	$scope.init();
	
});

