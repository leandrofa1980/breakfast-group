import DataTable from "components/DataTable";
import { Footer } from "components/Footer";

const List = () => {
  return (
    <>
      <div
        className="d-flex flex-column 
      flex-md-row 
      align-items-center 
      p-3 px-md-4 mb-3 
      bg-dark border-bottom shadow-sm"
      >
        <div className="container">
          <div className="nav">
            <nav className="navbar my-2 my-md-0 mr-md-3">
              <h3 className="text-light">Breakfast Group</h3>
              <ul className="nav px-4">
                <li className="nav-item">
                  <a className="nav-link" href="/">
                    Home
                  </a>
                </li>
              </ul>
            </nav>
          </div>
        </div>
      </div>
      <div className="container col-sm-8">
        <div className="jumbotron">
          <h1 className="text-primary display-6">Participantes</h1>
          <DataTable />
        </div>
      </div>
      <Footer />
    </>
  );
};

export default List;
