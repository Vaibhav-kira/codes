best <- function(state, outcome) {
  

  outcomes = c("heart attack", "heart failure", "pneumonia")
  

  if( outcome %in% outcomes == FALSE ) {
    stop("invalid outcome")
  }
  

  data <- read.csv("outcome-of-care-measures.csv", colClasses = "character")
  
                          
  #Hospital name ; State ; 3 cases
  
  data <- data[c(2, 7, 11, 17, 23)]
  names(data)[1] <- "name"
  names(data)[2] <- "state"
  names(data)[3] <- "heart attack"
  names(data)[4] <- "heart failure"
  names(data)[5] <- "pneumonia"
  
  ## data["state"]
  states <- data[,2]
  states <- unique(states)
  if( state %in% states == FALSE ) {
    stop("invalid state")
  }
  
  ## Get only the rows with our state value	
  data <- data[data$state==state & data[outcome] != 'Not Available', ]
  vals <- data[, outcome]
  
  ## RowNum = the index of the minimum value 
  rowNum <- which.min(vals)
  
  ## Return hospital name in that state with lowest 30-day death rate
  data[rowNum, ]$name
}