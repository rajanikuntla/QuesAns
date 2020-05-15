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
	
	$scope.validate = function() {
		var ans = $scope.ans;
		var actualAns = $scope.ques.answer;
		if (ans === actualAns){
			$scope.msg = "Entered answer is the correct answer"
		}else {
			$scope.msg = "Entered answer is the wrong answer"
		}
		
	}
	$scope.init();
	
});

