#Write a function that reads a directory full of files and reports the number of completely observed cases in each data file. 
complete <- function(directory, id=1:332){
      mylist <- list.files(path=directory, pattern=".csv")
      nobs <- numeric()
      for(i in id){
            mydata <- read.csv(paste0(directory,mylist[i]))
            mysum <- sum(complete.cases(mydata))
            nobs <- c(nobs, mysum)
      }
      data.frame(id, nobs)
}