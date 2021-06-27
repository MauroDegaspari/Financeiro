function DataTable() {
    return (
      <div className="table-responsive">
      <table className="table table-striped table-sm">
          <thead>
              <tr>
                  <th>Data</th>
                  <th>Nome</th>
                  <th>Clientes visitados</th>
                  <th>Negócios fechados</th>
                  <th>Valor</th>
                  </tr>
          </thead>
          <tbody>
              <tr>
                  <td>22/04/2021</td>
                  <td>Barry Allen</td>
                  <td>34</td>
                  <td>25</td>
                  <td>15017.00</td>
              </tr>
              <tr>
                  <td>22/04/2021</td>
                  <td>Taynara</td>
                  <td>34</td>
                  <td>25</td>
                  <td>15017.00</td>
              </tr>
              <tr>
                  <td>22/04/2021</td>
                  <td>Horuam</td>
                  <td>23</td>
                  <td>43</td>
                  <td>15017.00</td>
              </tr>
          </tbody>
      </table>
  </div>
      
    );
}

export default DataTable;