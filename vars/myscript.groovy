def info(message) {
	echo  "\033[4;32mINFO:\033[0m \033[1;33m${message}\033[0m\n"
	//echo "\u001B[4;32m [INFO: ] \u001B[0m \u001B[1;33m ${message} \u001B[0m"  
	
	/* Both are working but the numbering matters, I don't know why, it should be in ascending order like 4;32m is valid but
	32;4m is invalid*/
	
}

def warning(message) {
    echo "WARNING: \033[1;31;43m${message}\033[0m"
}

def gitCommitId(message)
{
      echo  "\033[4;32m[Git Commit ID] \033[0m \033[1;33m ${message} \033[0m\n"
}
