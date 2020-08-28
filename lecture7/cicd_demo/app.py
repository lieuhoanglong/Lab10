from flask import Flask, render_template
#Only for FLASK
import os

app = Flask(__name__)

#Main page
@app.route('/')
def main_page():
	return render_template('random.html')

#Testing to check if it works
@app.route('/test')
def test():
    return "Frontend Tsting Works!"
