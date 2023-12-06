Feature: AddDonation

  Background:
    Given Go to Cart page

  @AddDonation_TC_01
 Scenario: Add donation for Gaza with dummy data

    When Enter data with the following details:
      |  firstName  |  lastName  |  phoneNumber  |      email       |  country  |  government  |   city   |  district  |  street  |  square  |  landMark  |  building  |  floor  |  flat  |  toSpecificCity  |   paymentWay    |  recurring  |
      |     may     |    june    |  01000000000  |  mmzi@gmail.com  |    مصر    |     الفيوم    |  الفيوم  |    الفيوم   |    15    |   سكو    |     سكو    |      2     |     1   |    1   |        no        |  تبرع من المنزل   |   كل شهر    |

    Then Verify that the successful message is displayed