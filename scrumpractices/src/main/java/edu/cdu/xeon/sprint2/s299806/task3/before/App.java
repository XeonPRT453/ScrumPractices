package edu.cdu.xeon.sprint2.s299806.task3.before;

 public class Video 
   { 
        public void PayFee(decimal fee) 
        { 
        } 

        public void RentVideo(Video video, Customer customer) 
        { 
            customer.Videos.Add(video); 
        } 

        public decimal CalculateBalance(Customer customer) 
        { 
            returncustomer.LateFees.Sum(); 
        } 
    } 

    public class Customer 
   { 
        public IList<decimal> LateFees { get; set; } 
        public IList<Video> Videos { get; set; } 
    } 
