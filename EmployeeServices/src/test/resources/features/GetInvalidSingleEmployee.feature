Feature: Rest API for valid Single Employee

  Scenario: Get Single Employee Info Valid GET Request

    Given baseUrl and invalid resourcePath
    When Make a invalid GET call
    Then I should received status code 200

