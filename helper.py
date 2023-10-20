with open('origin.txt', 'r') as f:
    text = f.read()
    with open('out.txt', 'w') as f2:
        f2.write(text.replace(" ","").replace("\n","$(br)"))