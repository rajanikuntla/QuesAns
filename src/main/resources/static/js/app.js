var app = angular.module('app', ['ngRoute','ngResource']);
app.config(function($routeProvider){
    $routeProvider
        .when('/',{
            templateUrl: '/views/addQuestion.html',
            controller: 'addQuestionController'
        })
        .when('/addQuestion',{
        	templateUrl: '/views/addQuestion.html',
            controller: 'addQuestionController'
        })
        .when('/getQuestion',{
        	templateUrl: '/views/getQuestion.html',
            controller: 'getQuestionController'
        })
        .otherwise(
                { redirectTo: '/'}
            );
});