# Selenuim Task

I make two feature and called them (Select Donation & Add Donation)

Select Donation => choose the type of donation from the home page and add the donation value then add it to donations cart

Add Donation => fill dummy data and complete the donation process

Actually, I was supposed to put the Select Donation steps in the background of the Add Donation but I didn't do that because the Select Donation scenario failed.
So I went to the Cart Page directly through its link.


# Result

The First Feature (Select Donation) -> choose the type of donation and add value successfully but failed when click on donation button.

The Second Feature (Add Donation) -> fill the fields with data successfully but failed when arrive at governorate field because the governorates did not appear.

I devoted significant time and exerted every possible effort to identify and resolve the problem. However, my investigation led me to discover that some of the API responses are failing, and I think this is the main reason to fail tests.

Furthermore, during my extensive research, I came across a response on the Stack Overflow website.

![Untitled](https://github.com/Mahmoud-Zaki/Selenium-Task/assets/60368259/8c35598e-9cc4-4db6-81ee-64edf6f5cd53)
