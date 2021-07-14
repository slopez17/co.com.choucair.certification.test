@stories
  Feature: utest automation
    As a user I want to sign up at utest web page with my log information to access to utest services

  @scenario1
  Scenario Outline:
    Given than the user wants to sign up at utest web page

    When the user enters its log information
      |strFirstName|strLastName|strEmail|strBirthDay|strBirthMonth|strBirthYear|strLanguages|strCity|strZip|strCountry|strPC|strVersion|strLanguage|strBrand|strModel|strOS|strPassword|
      |<strFirstName>|<strLastName>|<strEmail>|<strBirthDay>|<strBirthMonth>|<strBirthYear>|<strLanguages>|<strCity>|<strZip>|<strCountry>|<strPC>|<strVersion>|<strLanguage>|<strBrand>|<strModel>|<strOS>|<strPassword>|
    Then the user can read
      |strMessage|
      |<strMessage>|

    Examples:
      |strFirstName|strLastName|strEmail|strBirthDay|strBirthMonth|strBirthYear|strLanguages|strCity|strZip|strCountry|strPC|strVersion|strLanguage|strBrand|strModel|strOS|strPassword|strMessage|
      |Sandra      |Lopez      |d@ex.com|18         |April        |1997        |Spanish     |Malaga |29007 |Spain     |Linux|Ubuntu    |Spanish    |Apple   |iPhone  |iOS 2.2|Holi123456.*|Complete Setup|


