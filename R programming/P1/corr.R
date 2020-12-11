#Write a function that takes a directory of data files and a threshold for complete cases and calculates the correlation between sulfate and nitrate for monitor locations where the number of completely observed cases (on all variables) is greater than the threshold.
corr <- function(directory, threshold = 0){
      mylist <- list.files(path=directory, pattern=".csv")
      df <- complete(directory)
      ids <- df[df["nobs"] > threshold, ]$id
      corrr <- numeric()
      for(i in ids){
            mydata <- read.csv(paste0(directory,mylist[i]))
            dff <- mydata[complete.cases(mydata), ]
            corrr <- c(corrr, cor(dff$sulfate, dff$nitrate))
      }
      return(corrr)
}