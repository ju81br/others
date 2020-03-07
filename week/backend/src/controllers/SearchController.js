const Dev = require('../models/dev');
const parseSringAsArray = require('../utils/parseStringAsArray');

module.exports = {
    async index (request, response){
        //aqui faz a busca dos Devs no raio de 10km e por tecnologia
        const { latitude, longitude, techs } = request.query;
        const techsArray = parseSringAsArray(techs);

        const devs = await Dev.find({
            techs: {
              $in: techsArray,
            },
            location: {
              $near: {
                    $geometry: {
                        type: 'Point',
                        coordinates: [longitude, latitude],
                    },
                    $maxDistance: 10000,
                },
            },
        });
        //console.log(techsArray);
        //console.log(request.query);

        return response.json({ devs });

    }
}