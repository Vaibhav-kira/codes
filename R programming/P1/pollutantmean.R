## 'pollutantmean' that calculates the mean of a pollutant (sulfate or nitrate) across a specified list of monitors. The function 'pollutantmean' takes three arguments: 'directory', 'pollutant', and 'id'.
pollutantmean <- function(directory, pollutant, id=001:332){
  mylist <- list.files(path=directory, pattern=".csv")
  z <- numeric()
  for(i in id){
    mydata <- read.csv(paste0(directory,mylist[i]))
    z <- c(z, mydata[[pollutant]])
  }
  mean(z, na.rm=T)
}