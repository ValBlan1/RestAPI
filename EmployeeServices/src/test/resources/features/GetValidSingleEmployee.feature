Feature: Rest API for valid Single Employee

  Scenario: Get Single Employee Info Valid GET Request

    Given baseUrl and valid resourcePath
    When Make a valid GET call
    Then I should received status code 200

