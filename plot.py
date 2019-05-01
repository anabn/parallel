import numpy as np
from plotly.offline import plot
import plotly.graph_objs as go

def func(x, y, A=15, B=13, b=.1, a = .5):
    return np.power((1/(B - 10 * a * y))*np.power(x, 2)+A*((B-10*a*y)**-0.2)-b*(B-10*a*y)/(24*a),2)

def readFromFile(filename):
    f = open(filename)
    numbers_list = []
    overall_list = []

    for line in f:
        line = line.strip()
        numbers_list = [s for s in line.split(' ')]
        converted_to_float_number_list = [float(i) for i in numbers_list if i != '']
        overall_list.insert(len(overall_list), converted_to_float_number_list)
    f.close()
    return np.array(overall_list)
x = np.linspace(0, 1, 30)
t = np.linspace(0, 1, 900)

def main():
    x_grid,t_grid = np.meshgrid(x, t)
    z_approximated = readFromFile("sequential")
    z_correct = func(x_grid, t_grid)

    data = [go.Surface (x = x, y = t, z = z_approximated, opacity = 0.6), go.Surface(x = x, y = t, z = z_correct, showscale = False)]

    layout = go.Layout(
                       title='3D Surface',
                       autosize=True,
                       width=1200,
                       height=700,
                       margin={'l': 65, 'r': 50, 'b': 65, 't': 90}
                       )
    fig = go.Figure(data=data, layout=layout)
    plot(fig, filename='Solution.html')

if __name__ == '__main__':
    main()
