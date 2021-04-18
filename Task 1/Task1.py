error = {}
with open("task_1_application.log", "r") as file:
    data = file.readlines()

    for line in data:
        if "ERROR" in line:
            # Slicing the line to remove time-stamp
            line = line[13:]
            if line in error:
                count = error[line]
                count += 1
                error.update({line: count})
            else:
                error[line] = 1

file.close()


with open('error_log.txt', 'a') as error_log:
    for line, count in error.items():
        # Appending count before error in line
        line = "Count: {} ".format(str(count)) + line
        error_log.write(line)

error_log.close()
